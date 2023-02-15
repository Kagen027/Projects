import React from 'react'
import "../../../css/reusables/ReactiveServiceInfoSections/InfoSectionContent.css"
import DollarSign from '../DollarSign'
import Disclaimer from './Disclaimer'

function CompleteDetails() {
  return (
    <>
    <div id='info-section-content-container' className='flex-col'>
        <div className='info-section-content-title1'>Complete Cleanings</div>

        <div className='flex-row'>
            <div className='info-section-content-service1'>PREMIUM WASH & DASH</div>
            <div className='info-section-content-price1'><div className='basic-underline'><DollarSign/>85 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>105 Suv / Mini Van</div></div>
        </div>
        <div className='info-section-content-description-1'>
        For this Complete cleaning option, we will professionally hand-washed your vehicle.  Following our washing procedures we will dry with high pressure air and towels. 
        We will then remove and clean your floormats.  While your matts are drying we will Vacuum the seats and floors. 
        Next we will give your windows a nice shine, and lastly we will dust off your dash, steering column, displays, and door pannels.
        Just to add a little icing on the top, we dress your tires to give your freshly cleaned ride that extra pop!  This entry level complete cleaning
        </div>

        <div className='flex-row'>
            <div className='info-section-content-service2'>THE TOUCH & DASH</div>
            <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>140 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>155 Suv / Mini Van</div></div>
        </div>
        <div className='info-section-content-description-2'>
        For this Complete cleaning option, we will professionally hand-washed your vehicle and ensure all coatings and waxes are removed.  Following our washing procedures we will dry with high pressure air and towels. 
        We will then clay-bar and decontaminate your vehicle.  To Finish the exterior we will treat your vehicle with ceramic spray wax and our highly requested P&s Bead Maker treatment.
        To start the interior we clean your floormats and Vacuum the seats, floors, cup holders, and door compartments. 
        Next we will we will clean and wipe down all visible surfaces of your interior. Last but not least we will give your windows a nice shine, 
        Oh and dont forget we round all that up with a nice tire dressing!  
        </div>

        <div className='flex-row'>
            <div className='info-section-content-service2'>THE STRIP & DASH</div>
            <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>185 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>210 Suv / Mini Van</div></div>
        </div>
        <div className='info-section-content-description-2'>
        For this Wash option, We will professionally hand-washed and ensure all coatings and waxes from the vehicle are removed. Next we will clay-bar and decontaminate your vehicle with precision. 
        Once the contaminants have been removed from your paint we will wax and seal the paint with Chemical Guys liquid wax to give your paint the best protection and appearance for the price that last on average 3 months. 
        After that we still treat with P&s Bead Maker to give that finishing exterior touch. For the Interior the floormats, seats, floors, cup holders, and door compartments will be vacuumed and cleaned. 
        Next we will we will spot clean any fabric areas of worry to you as well as getting any visible spots or stains. Moving on to wiping down all visible surfaces of your interior.  
        Your interior will get a treatment with our interior protectant for Vinyl, Rubber, and Plastic.  If you are a leather owner your leather will also be cleaned and treated.
        Lastly your windows will be cleaned to a perfect shine. And to sum it all up with the Tires dressed!
        </div>
        
        <div className='info-section-content-title2'>Complete Details</div>

        <div className='flex-row'>
            <div className='info-section-content-service1'>The Full Works</div>
            <div className='info-section-content-price1'><div className='basic-underline'><DollarSign/>300 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>325 Suv / Mini Van</div></div>
        </div>
        <div className='info-section-content-description-1'>
        For this Detail Package Your vehicle will professionally hand-washed and all coatings and waxes from the vehicle removed. Next we will clay-bar and decontaminate your vehicle with precision.  This process helps to remove imbedded debris from your paint and prepare for waxing. 
        Once the contaminants have been removed from your paint we will wax and seal the paint with Collinite 915 polymer-carnauba wax to give your paint the best protection and glass like finish that last on average 6 months. 
        After that we still treat with P&s Bead Maker to give that finishing exterior touch.  For the Interior we will remove and clean your floormats, vacuum your entire interior front to back and front again. 
        Next we will clean shampoo and extract all fabric carpets and surfaces. We will scrub and wipe down all surfaces of your interior aswell as steam clean.  
        Your interior will be treated with our interior protectant for Vinyl, Rubber, and Plastic.  If you are a leather owner your leather will also be cleaned and treated.
        Lastly your windows will be cleaned to a perfect shine. This option is for customers who want a completee vehicle detail for that better than new car feeling!
        </div>

        <div className='flex-row'>
            <div className='info-section-content-service2'>The Full Works + Paint Correction</div>
            <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>465 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>485 Suv / Mini Van</div></div>
        </div>
        <div className='info-section-content-description-2'>
        This Package is the everything included in The Full Works while also having our paint correcting specialist perform needed repairs and corrections.  
        This is our Ultimate Package with Ultimate Savings!
        </div>
    </div>
    <Disclaimer/>
</>
  )
}

export default CompleteDetails