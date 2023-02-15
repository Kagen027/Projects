import React, {useEffect, useState} from 'react'
import "../../css/pages/QuoteDetails.css"
import { useParams } from 'react-router-dom'
import axios from 'axios'
import LoadingSpinner from "../reusables/LoadingSpinner.js"
import NavBarHome from '../reusables/NavBarHome'
import MultiSelect from "multiselect-react-dropdown";
import {FaArrowDown} from 'react-icons/fa';
import DollarSign from '../reusables/DollarSign'

function QuoteDetails(props) {
const { id } = useParams();

const [customerVehicle, setCustomerVehicle] = useState()
const [isLoading, setIsLoading] = useState(true)
const [isQuoteShowing, setIsQuoteShowing] = useState(false)
const [price, setPrice] = useState(0.00)

useEffect(() => {
  axios.get("http://localhost:8080/getVehicleById/" + id)
  .then((response) => {
    setTimeout(() => {
      setCustomerVehicle(response.data)
      console.log(response.data)
      setIsLoading(false)
    }, 500)
  })
  .catch((e) => {
    console.log(e)
  })
  // eslint-disable-next-line react-hooks/exhaustive-deps
}, [])

const products = [
  {
      id: 1,
      detailType: "Exterior",
      productName: "Premium Hand Wash",
      price: 45,
  },
  {
      id: 2,
      detailType: "Exterior",
      productName: "The Touch Up Wash",
      price: 75,
  },
  {
      id: 3,
      detailType: "Exterior",
      productName: "The Strip & Shine",
      price: 95,
  },
  {
      id: 4,
      detailType: "Exterior",
      productName: "Exterior Basic Detail",
      price: 155,
  },
  {
    id: 5,
    detailType: "Exterior",
    productName: "The Paint Corrector",
    price: 255,
  },
  {
    id: 6,
    detailType: "Interior",
    productName: "The Fast Dash",
    price: 45,
  },
  {
    id: 7,
    detailType: "Interior",
    productName: "The Thorough Dash",
    price: 75,
  },
  {
    id: 8,
    detailType: "Interior",
    productName: "The Complete Dash",
    price: 100,
  },
  {
    id: 9,
    detailType: "Interior",
    productName: "Interior Basic Detail",
    price: 100,
  },
  {
    id: 10,
    detailType: "Complete Cleaning",
    productName: "Premium Wash & Dash",
    price: 85,
  },
  {
    id: 11,
    detailType: "Complete Cleaning",
    productName: "The Touch & Dash",
    price: 140,
  },
  {
    id: 12,
    detailType: "Complete Cleaning",
    productName: "The Strip & Dash",
    price: 185,
  },
  {
    id: 13,
    detailType: "Complete Cleaning",
    productName: "The Full Works",
    price: 300,
  },
  {
    id: 14,
    detailType: "Complete Cleaning",
    productName: "The Full Works + Paint Correction",
    price: 465,
  },
  {
    id: 15,
    detailType: "Standalones",
    productName: "Engine Bay Cleaning",
    price: 35,
  },
  {
    id: 16,
    detailType: "Standalones",
    productName: "Headlight Restoration",
    price: 55,
  },
  {
    id: 17,
    detailType: "Standalones",
    productName: "Windshield Ceramic Coating",
    price: 100,
  },
  {
    id: 18,
    detailType: "Standalones",
    productName: "All Glass Ceramic Coating",
    price: 200,
  }
]

const quoteContent = () => {
  if(!isQuoteShowing || price === 0){
    return(
    <div className='select-service'>Please Select Services</div>
    )
  }else if (customerVehicle.type==="Car"){
    let carPrice = (Math.round((price) * 100) / 100).toFixed(2)
    return(
      <div className='select-service'>
        <div className='advanced-underline'>Your Total: &nbsp; <DollarSign/>{carPrice}</div>
      </div>
    )
  }else if (customerVehicle.type==="Truck"){
    let truckPrice = (Math.round((price*1.222) * 100) / 100).toFixed(2)
    return(
      <div className='select-service'>
        <div className='advanced-underline'>Your Total: &nbsp; <DollarSign/>{truckPrice}</div>
      </div>
    )
  }else if (customerVehicle.type==="Mini-Van"){
    let miniPrice = (Math.round((price*1.222) * 100) / 100).toFixed(2)
    return(
      <div className='select-service'>
        <div className='advanced-underline'>Your Total: &nbsp; <DollarSign/>{miniPrice}</div>
      </div>
    )
  }else if (customerVehicle.type==="SUV"){
    let suvPrice = (Math.round((price*1.444) * 100) / 100).toFixed(2)
    return(
      <div className='select-service'>
        <div className='advanced-underline'>Your Total: &nbsp; <DollarSign/>{suvPrice}</div>
      </div>
    )
  }
  else if (customerVehicle.type==="Van"){
    let vanPrice = (Math.round((price*1.444) * 100) / 100).toFixed(2)
    return(
      <div className='select-service'>
        <div className='advanced-underline'>Your Total: &nbsp; <DollarSign/>{vanPrice}</div>
      </div>
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
        
         <div className='quote-details-content flex-col'>
            <div className='quote-details-intro'><div className='quote-details-intro-title'>{customerVehicle.ownersName}'s {customerVehicle.year} {customerVehicle.make} {customerVehicle.model}</div></div>
            <div className='quote-details-action'> Click Here To Select Services &nbsp; <FaArrowDown/></div>
              <div className='quote-form-container flex-col'>
              <div className="vehicle-form-quote flex-col">
                          <MultiSelect
                            placeholder=''
                            displayValue="productName"
                            groupBy="detailType"
                            onKeyPressFn={function noRefCheck(){}}
                            // onRemove={setIsSelected}
                            onSearch={function noRefCheck(){}}
                            onSelect={(event) => {
                              setPrice(event.reduce((sum, item) => sum + item.price ,0))
                            }}
                            onRemove={(event) => {
                              setPrice(event.reduce((sum, item) => sum + item.price ,0))
                            }}
                            options = {products}
                          />
                      </div>
                      <div className='align-self-center margin-top-vh'>
                          <button className='button-66-get-quote' type="submit" onClick={setIsQuoteShowing}>Get Quote</button>
                      </div>
                      {quoteContent()}
                  </div>
          </div>
      )

    }
    
  }

  return (
    <div className='flex-col'>
        <NavBarHome customer={props.customer} setCustomer={props.setCustomer}/>
        {renderContent()}
    </div>
  )
}

export default QuoteDetails