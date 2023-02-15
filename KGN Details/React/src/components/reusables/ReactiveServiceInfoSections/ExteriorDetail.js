import React from 'react'
import '../../../css/reusables/ReactiveServiceInfoSections/InfoSectionContent.css'
import Disclaimer from './Disclaimer'
import DollarSign from '../DollarSign'

function ExteriorDetail() {
  return (
    <>
        <div id='info-section-content-container' className='flex-col'>
            <div className='info-section-content-title1'>Exterior Washes</div>

            <div className='flex-row'>
                <div className='info-section-content-service1'>PREMIUM HAND WASH</div>
                <div className='info-section-content-price1'><div className='basic-underline'><DollarSign/>45 Car</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>55 Truck / Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-1'>
            For this Wash option, We will professionally hand-washed your vehicle.  Following our washing procedures we will dry with high pressure air and towels. 
            Just to add a little icing on the top, we dress your tires to give your freshly cleaned ride that extra pop!
            </div>

            <div className='flex-row'>
                <div className='info-section-content-service2'>THE TOUCH UP WASH</div>
                <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>75 Car</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>85 Truck / Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-2'>
            For this Wash option, We will professionally hand-washed your vehicle.  Following our washing procedures we will dry with high pressure air and towels. 
            We will treat your vehicle with ceramic spray wax and our highly requested P&s Bead Maker treatment. Don't worry we still dress your tires on this one too!  If your vehicle has been waxed or Coated
            this wash will extend the life of your treatment and give your paint that extra shine you've been missing.
            </div>

            <div className='flex-row'>
                <div className='info-section-content-service2'>THE STRIP & SHINE</div>
                <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>95 Car</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>105 Truck / Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-2'>
            For this Wash option, We will professionally hand-washed and ensure all coatings and waxes from the vehicle removed. Next we will clay-bar and decontaminate your vehicle with precision. 
            Once the contaminants have been removed from your paint we will wax and seal the paint with Chemical Guys liquid wax to give your paint the best protection and appearance for the price that last on average 3 months. 
            Wrapping up the exterior we will treat with P&s Bead Maker and dress your tires.
            </div>
            
            <div className='info-section-content-title2'>Exterior Details</div>
    
            <div className='flex-row'>
                <div className='info-section-content-service1'>EXTERIOR BASIC DETAIL</div>
                <div className='info-section-content-price1'><div className='basic-underline'><DollarSign/>155 Car</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>165 Truck / Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-1'>
            For this Detail Package Your vehicle will professionally hand-washed and all coatings and waxes from the vehicle removed. Next we will clay-bar and decontaminate your vehicle with precision.  This process helps to remove imbedded debris from your paint and prepare for waxing. 
            Once the contaminants have been removed from your paint we will wax and seal the paint with Collinite 915 polymer-carnauba wax to give your paint the best protection and glass like finish that last on average 6 months. 
            After that we still treat with P&s Bead Maker to give that finishing touch and dress your tires.
            </div>

            <div className='flex-row'>
                <div className='info-section-content-service2'>THE PAINT CORRECTOR</div>
                <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>255 Car</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>265 Truck / Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-2'>
            For this Detail option we will start by hand-washing and removing all waxes and coating from the vehicle. Next the vehicle will be decontaminated to prevent any further swirls or scratches.
            One of our paint correcting specialist, will asses your vehicle for it own personal needs and correction plan.  Once a plan has been developed your paint will be buffed, polished, and protected.
            after the paint correcting process we will wax and seal the paint with Collinite 915 polymer-carnauba wax to give your paint the best protection and glass like finish that last on average 6 months. 
            After that we finish your treatment with P&s Bead Maker and tire dressing.
            </div>
        </div>
        <Disclaimer/>
    </>
  )
}

export default ExteriorDetail