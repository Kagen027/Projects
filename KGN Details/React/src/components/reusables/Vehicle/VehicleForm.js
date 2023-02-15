import axios from 'axios';
import React from 'react'
import "../../../css/reusables/Vehicle/VehicleForm.css"
import { useState } from 'react';

function VehicleForm(props) {
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

  return (
    <div className="contents">
        <div className="vehicle-form-box flex-col">
            <h1 className="flex-col vehicle-form-h1">New Vehicle</h1>
           <p className='form-vehicle-p'><strong>Please Fill Out Your Vehicle Info</strong></p>
            <div className='vehicle-form-container flex-col'>
            <div className="vehicle-form flex-col">
                        <select className='input1' onChange={changeHandler} name='type' value={vehicle.lastName}>
                            <option value="Car">Car</option>
                            <option value="Truck">Truck</option>
                            <option value="SUV">SUV</option>
                            <option value="Van">Van</option>
                            <option value="Mini-Van">Mini-Van</option>
                        </select>
                        <input className="input2" type="text" placeholder='Make' onChange={changeHandler} name='make' value={vehicle.lastName}/>
                        <input className="input2" type="text" placeholder='Model' onChange={changeHandler} name='model' value={vehicle.emailAddress}/>
                        <input className="input2" type="text" placeholder='Year' onChange={changeHandler} name='year' value={vehicle.password}/>
                        <input className="input2" type="text" placeholder="Owner's Name" onChange={changeHandler} name='ownersName' value={vehicle.confirmPassword}/>
                    </div>
                    <div className='align-self-center margin-top-60'>
                        <button className='button-66' type="submit" onClick={sumbitHandler}>Submit</button>
                    </div>
                </div>
            </div>
    </div>

  )
}

export default VehicleForm