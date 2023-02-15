import React, {useEffect, useState}from 'react'
import '../../css/pages/Portfolio.css'
import axios from 'axios'
import NavBar from '../reusables/NavBar'
import PhotoHeader from '../reusables/PhotoHeader'
import LoadingSpinner from "../reusables/LoadingSpinner.js"
import PreviousProjectComponent from '../reusables/PreviousProjectComponent'
import Splash from '../reusables/Splash'

function Portfolio(props) {

  const [allPreviousProject, setAllPreviousProject] = useState([])
  const [isLoading, setIsLoading] = useState(true)


  useEffect(() => {

    axios.get("http://localhost:8080/viewAllPreviousProject")
    .then((response) => {
      setTimeout(() => {
        setAllPreviousProject(response.data)
        setIsLoading(false)
      }, 1000)
    })
    .catch((e) => {
      console.log(e)
    })

  }, [])

  const renderContent = () => {

    if(isLoading) {
        return(
          <div className='flex-col center fill-vertical'><LoadingSpinner/></div>
        )
    }else{

      return(

        allPreviousProject.map((previousProject) => {
          return(
             <PreviousProjectComponent previousProject={previousProject} />
          )
        })

      )

    }
    
  }
  return (
    <>
      <NavBar customer={props.customer} setCustomer={props.setCustomer}/>
      <PhotoHeader headerClassId="photo-header-portfolio"/>
      <div className='center'>
        <div className='portfolio-intro'><Splash size={"vid-size" } margin={"vid-margin"}/><div className='previous-work-intro'>&nbsp;Previous Work</div></div>
      </div>
      <div id='all-previous-container' className='flex-row center'>
        {renderContent()}
      </div>
    </>
  )
}

export default Portfolio