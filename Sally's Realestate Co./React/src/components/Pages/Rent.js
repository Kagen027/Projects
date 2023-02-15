import React from 'react'
import HouseComponents from '../Reusables/HousesComponents'
import {FaBars,FaTimes, FaHome} from 'react-icons/fa';
import '../Pages/Sales.css'

function Rent() {
  return (
    <>
      <div className='center'>
        <div className='intro center'><FaHome className='house-icon'/>&nbsp;Sally's Realestate Co. Homes For Rent </div>
      </div>
      <div id='houses' className='flex-row center'>
        
      </div>
    </>
  )
}

export default Rent