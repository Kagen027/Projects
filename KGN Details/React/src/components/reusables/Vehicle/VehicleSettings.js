import axios from 'axios';
import React from 'react'
import LoadingSpinner from "../../reusables/LoadingSpinner.js"
import "../../../css/reusables/Vehicle/VehicleSettings.css"
import { useState,useEffect } from 'react';
import {FaTrash} from 'react-icons/fa';

function VehicleSettings(props) {


  const [isLoading, setIsLoading] = useState(true)
  const [vehicleId] = useState(props.vehicleId)
  const [customerId] = useState(props.customer.id)
 
  useEffect(() => {  
    setIsLoading(false)  
  }, [])



  const [vehicle, setvehicle] = useState({
    id: vehicleId,
    type: (props.type),
    make: (props.make),
    model: (props.model),
    year: (props.year),
    ownersName: (props.ownersName)
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

  const trashHandler = () => {
    axios.delete('http://localhost:8080/deleteVehicleById/' + vehicleId, vehicle)
    .then((response) => {
      window.location.reload()
  }).catch((e) => {
      console.log(e)
  })

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
    <div className="contents-vehicle-setting">
        <div className="vehicle-setting-box flex-col">
        <div className='trash-container'><FaTrash className='trash' onClick={trashHandler}/></div>
            <h1 className="flex-row vehicle-setting-h1">
              <div>{props.ownersName}'s {props.year} {props.make} {props.model}</div>
            </h1>
           <p className='vehicle-setting-p'><strong>Update Vehicle Information</strong></p>
            <div className='vehicle-setting-container flex-col'>
            <div className="vehicle-form flex-col">
                        <select className='input1' onChange={changeHandler} name='type' defaultValue={props.type} value={vehicle.lastName}>
                        <option value="Car">Car</option>
                            <option value="Truck">Truck</option>
                            <option value="SUV">SUV</option>
                            <option value="Van">Van</option>
                            <option value="Mini-Van">Mini-Van</option>
                        </select>
                        <input className="input2" type="text" placeholder='Make' onChange={changeHandler} name='make' defaultValue={props.make} value={vehicle.lastName}/>
                        <input className="input2" type="text" placeholder='Model' onChange={changeHandler} name='model' defaultValue={props.model} value={vehicle.emailAddress}/>
                        <input className="input2" type="text" placeholder='Year' onChange={changeHandler} name='year' defaultValue={props.year} value={vehicle.password}/>
                        <input className="input2" type="text" placeholder="Owner's Name" onChange={changeHandler} name='ownersName' defaultValue={props.ownersName} value={vehicle.confirmPassword}/>
                    </div>
                    <div className='align-self-center margin-top-60'>
                        <button className='button-66' type="submit" onClick={sumbitHandler}>Submit</button>
                    </div>
                </div>
            </div>
    </div>
      </>
    )

  }
}
const renderContent = () => {

  if(isLoading) {
      return(
        <div className='flex-col center fill-vertical'><LoadingSpinner/></div>
      )
  }else{
    return(
      <>
        {correctContent()}
      </>
    )

  }
  
}
return (
<>
{renderContent()}
</>
)
}

export default VehicleSettings