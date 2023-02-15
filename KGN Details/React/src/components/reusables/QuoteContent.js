import React, { useState, useEffect} from 'react'
import LoadingSpinner from "../reusables/LoadingSpinner.js"
import "../../css/reusables/QuoteContent.css"
import Modal from './Modal';
import VehicleQuote from "./Vehicle/VehicleQuote"
import VehicleForm from './Vehicle/VehicleForm'
import VehicleButton from './Vehicle/VehicleButton.js';


function QuoteContent(props) {
    const [isLoading, setIsLoading] = useState(true)
    const [isModalShowing, setIsModalShowing] = useState(false)
    const [isModalShowingQuote, setIsModalShowingQuote] = useState(false)

    useEffect(() => {  
      setIsLoading(false)  
    }, [])

      const toggleModal = () => {
        if(isModalShowing){
          // Following line makes it so when Modal is active the page is not Scrollable
          document.body.style.overflow = "hidden";
          return(
            <Modal isModalShowing={isModalShowing} setIsModalShowing={setIsModalShowing} modalClass={"modal-quote"} contentClass={"modal-conten-quote"}>
                <VehicleForm customer={props.customer} setCustomer={props.setCustomer}/>
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

    const toggleModalQuote = () => {
      if(isModalShowingQuote){
        // Following line makes it so when Modal is active the page is not Scrollable
        document.body.style.overflow = "hidden";
        return(
          <Modal isModalShowing={isModalShowingQuote} setIsModalShowing={setIsModalShowingQuote} modalClass={"modal-quote"} contentClass={"modal-conten-quote"}>
              <VehicleQuote customer={props.customer} setCustomer={props.setCustomer}/>
          </Modal>
        )
      }else{
        return(
        null
        )
      }
    }

        
    const onModalQuote = (event) => {
      setIsModalShowingQuote(true)
  }

  
    const renderVehicles = () => {
      if ((props.customer.garage) !== null){
      return (props.customer.garage).map((vehicle, index) => {
        return (
            <VehicleButton
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

  const isGarageEmpty = () => {
    if((props.customer.garage).length === 0){
      return(
      <div className='quote-warning-container'>
        <div className='quote-warning flex-col'>
          <div className='center'>Please Create A Vehicle To Start A Quote</div>
        </div>
      </div>  
      )
    }else{
      return(
      <div className='flex-col start-quote-container'>
        <div className='start-quote'>Start A New Quote!</div>
        <div className='start-quote-button'><button className='button-66-quote' onClick={onModalQuote}>New Quote</button></div>
        {toggleModalQuote()}
      </div>

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
            <div className='your-vehicles-container flex-row'>
                <div className='your-vehicles-customer'>{props.customer.firstName}'s Vehicles</div>
              <button className='button-6 align-self-center' onClick={onModal}>Create New Vehicle</button>
            </div>
            <div className='vehicles-container'>
              {renderVehicles()}
            </div>
            <div className='is-garage-container'>
              {isGarageEmpty()}
            </div>
        </div>
        {toggleModal()}
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

export default QuoteContent