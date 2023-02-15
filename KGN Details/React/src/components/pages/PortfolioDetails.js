import React, {useEffect, useState} from 'react'
import { useParams } from 'react-router-dom'
import axios from 'axios'
import LoadingSpinner from "../reusables/LoadingSpinner.js"
import PreviousProjectDetails from "../reusables/PreviousProjectDetails"
import NavBar from '../reusables/NavBar'


function PortfolioDetails(props) {
  const { id } = useParams();
  
  const [projectDetails, setProjectDetails] = useState()
  const [isLoading, setIsLoading] = useState(true)

  useEffect(() => {
    axios.get("http://localhost:8080/getByPreviousProjectId/" + id)
    .then((response) => {
      setTimeout(() => {
        setProjectDetails(response.data)
        setIsLoading(false)
      }, 1000)
    })
    .catch((e) => {
      console.log(e)
    })
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [])

  const renderContent = () => {

    if(isLoading) {
        return(
          <div className='flex-col center fill-vertical'><LoadingSpinner/></div>
        )
    }else{

      return(
        
             <PreviousProjectDetails previousProject={projectDetails} />

      )

    }
    
  }

  return (
    <>
    <NavBar customer={props.customer} setCustomer={props.setCustomer}/>
    <div id='previous-details-container' className='flex-row center'>
      {renderContent()}
    </div>
  </>
  )
}

export default PortfolioDetails