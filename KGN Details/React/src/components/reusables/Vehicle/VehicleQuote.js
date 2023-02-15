import axios from 'axios';
import React from 'react'
import "../../../css/reusables/Vehicle/VehicleQuote.css"
import { useState } from 'react';
import VehicleButtonQuote from './VehicleButtonQuote';

function VehicleQuote(props) {
  const [customerId] = useState(props.customer.id)

  const [vehicle, setvehicle] = useState({
    type: "",
    make: "",
    model: "",
    year: "",
    ownersName: ""
  })

  const changeHandler = (event) =>{
    const name = event.target.name
    const value = event.target.value
    const temptvehicle = {...vehicle}
    temptvehicle[name] = value
    setvehicle(temptvehicle)
  }

  const sumbitHandler = () => {
    axios.post('http://localhost:8080/createVehicle/' + customerId, vehicle)
    .then((response) => {
      window.location.reload()
  }).catch((e) => {
      console.log(e)
  })

  }

    
  const renderVehicles = () => {
    if ((props.customer.garage) !== null){
    return (props.customer.garage).map((vehicle, index) => {
      return (
          <VehicleButtonQuote
            key={index}
            vehicleId={vehicle.id}
            make={vehicle.make}
            model={vehicle.model}
            year={vehicle.year}
            type={vehicle.type}
            ownersName={vehicle.ownersName}
            customer={props.customer} 
            setCustomer={props.setCustomer}
          />
      );
    });
  }else{
    return(
      <div></div>
    )
  }
}

const correctContent = () => {
  if (props.customer === null) {
    return (
        <div>
        </div>
    )
  }else{
    return(       
      <>
      <div className='flex-col vehicles-section-container'>
          <div className='flex-col new-quote-modal-title'>
              <div className='your-vehicles-new-quote'>New Quote</div>
              <div className='your-vehicles-customer-new-quote'>Select Vehicle You Would Like Quoted</div>
          </div>
          <div className='vehicles-container-quote'>
            {renderVehicles()}
          </div>
      </div>
      </>
    )

  }
}

  return (
    <div className="render-quote-container">
      {correctContent()}
    </div>

  )
}

export default VehicleQuote