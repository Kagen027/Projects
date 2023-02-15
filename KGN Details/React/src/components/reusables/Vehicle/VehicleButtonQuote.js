import React, { useState} from 'react'
import "../../../css/reusables/Vehicle/VehicleButton.css"
import { useNavigate } from 'react-router-dom'
import {FaCar} from 'react-icons/fa';

function VehicleButtonQuote(props) {

  const url = "/Quote/" + (props.vehicleId);  
  
  const navigate = useNavigate()

  const clickHandler = () =>{
        navigate(url)
   }  

  return (
    <div className='flex-col vehicle-button-box-quote' onClick={clickHandler}>
        <div className='flex-row button-customer-name-container'>
            <div className='button-customer-name-quote'>{props.ownersName}'s</div>
        </div>
        <div className='flex-row button-vehicle-title'>
            <div>{props.year}</div>
            <div>{props.make}</div>
            <div>{props.model}</div>
        </div>
        <FaCar className='car'/>
    </div>

  )
}

export default VehicleButtonQuote