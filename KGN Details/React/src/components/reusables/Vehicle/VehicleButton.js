import React, { useState} from 'react'
import Modal from '../Modal';
import VehicleSettings from "../Vehicle/VehicleSettings"
import "../../../css/reusables/Vehicle/VehicleButton.css"
import {FaCar,FaCog} from 'react-icons/fa';

function VehicleButton(props) {
  const [isModalShowing, setIsModalShowing] = useState(false)  

  const toggleModal = () => {
    if(isModalShowing){
      // Following line makes it so when Modal is active the page is not Scrollable
      document.body.style.overflow = "hidden";
      return(
        <Modal isModalShowing={isModalShowing} setIsModalShowing={setIsModalShowing} modalClass={"modal-quote"} contentClass={"modal-conten-vehicle-setting"}>
            <VehicleSettings  vehicleId={props.vehicleId} make={props.make} model={props.model} year={props.year}  type={props.type} ownersName={props.ownersName} customer={props.customer} setCustomer={props.setCustomer}/>
        </Modal>
      )
    }else{
      return(
      null
      )
    }
  }

const onModal = (event) => {
    setIsModalShowing(true)
}

  return (
    <div className='flex-col vehicle-button-box'>
        <div className='flex-row button-customer-name-container'>
            <div className='button-customer-name'> {props.ownersName}'s </div>
            <div><FaCog className='gear'onClick={onModal}/></div>
        </div>
        <div className='flex-row button-vehicle-title'>
            <div>{props.year}</div>
            <div>{props.make}</div>
            <div>{props.model}</div>
        </div>
        <FaCar className='car'/>
        {toggleModal()}
    </div>
    
  )
}

export default VehicleButton