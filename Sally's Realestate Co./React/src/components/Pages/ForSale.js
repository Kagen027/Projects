import React, { useEffect, useState } from 'react'
import LoadingSpinner from '../Reusables/LoadingSpinner';
import HouseComponentOverNinety from '../Reusables/HousesComponentOverNinety'

import {FaHome} from 'react-icons/fa';
import '../../CSS/Pages/ForSale.css'
import axios from 'axios';
import HouseComponentUnderNinety from '../Reusables/HouseComponentUnderNinety';

function ForSale() {

  const [forSaleHousesOverNinety, setForSaleHousesOverNinety] = useState([])
  const [forSaleHousesUnderNinety, setForSaleHousesUnderNinety] = useState([])
  const [isLoading, setIsLoading] = useState(true)

  useEffect(() => {

    axios.get("http://localhost:8080/viewHousesForSaleUnderNinety")
    .then((response) => {
        setForSaleHousesUnderNinety(response.data)
    })
    .catch((e) => {
      console.log(e)
    })

  }, [])

  useEffect(() => {

    axios.get("http://localhost:8080/viewHousesForSaleOverNinety")
    .then((response) => {
      setTimeout(() => {
        setForSaleHousesOverNinety(response.data)
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

        forSaleHousesUnderNinety.map((house) => {
          return(
             <HouseComponentUnderNinety house={house}/>
          )
        })

      )

    }
    
  }

  const renderContent2 = () => {
      return(
        forSaleHousesOverNinety.map((house) => {
          return(
             <HouseComponentOverNinety house={house}/>
          )
        })

      )
    
  }

  return (
    <>
      <div className='center'>
        <div className='intro center'><FaHome className='house-icon'/>&nbsp;Sally's Realestate Co. Homes For Sale </div>
      </div>
      <div id='houses' className='flex-row center'>
        {renderContent()}
        {renderContent2()}
      </div>
    </>
  )
}

export default ForSale