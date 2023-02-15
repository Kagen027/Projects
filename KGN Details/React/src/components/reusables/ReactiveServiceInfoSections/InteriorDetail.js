import React from 'react'
import "../../../css/reusables/ReactiveServiceInfoSections/InfoSectionContent.css"
import Disclaimer from './Disclaimer'
import DollarSign from '../DollarSign'

function InteriorDetail() {
  return (
    <>
        <div id='info-section-content-container' className='flex-col'>
            <div className='info-section-content-title1'>Interior Cleanings</div>

            <div className='flex-row'>
                <div className='info-section-content-service1'>THE FAST DASH</div>
                <div className='info-section-content-price1'><div className='basic-underline'><DollarSign/>45 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>60 Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-1'>
            For this Interior option, We will remove and clean your floormats.  While your matts are drying we will Vacuum the seats and floors. 
            Next we will give your windows a nice shine, and lastly we will dust off your dash, steering column, displays, and door pannels.  This
            is a great opption if you are in a hurry and need a quick fix, this will not clean every nook and crany but will get you back on the road
            feeling refreshed.
            </div>

            <div className='flex-row'>
                <div className='info-section-content-service2'>THE THOROUGH DASH</div>
                <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>75 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>90 Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-2'>
            For this Interior option, We will remove and clean your floormats.  While your matts are drying we will Vacuum the seats, floors, cup holders, and door compartments. 
            Next we will we will clean and wipe down all visible surfaces of your interior.  Lastly we will give your windows a nice shine. This option is for customers
            in a hurry but with a little more time to spare for a more thorough cleaning, this will not get every nook and crany but will get you back on the road
            feeling more refreshed than our Fast Dash.
            </div>


            <div className='flex-row'>
                <div className='info-section-content-service2'>THE COMPLETE DASH</div>
                <div className='info-section-content-price2'><div className='basic-underline'><DollarSign/>100 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>115 Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-2'>
            For this Interior option, We will remove and clean your floormats.  While your matts are drying we will Vacuum the seats, floors, cup holders, and door compartments. 
            Next we will we will spot clean any fabric areas of worry to you as well as getting any visible spots or stains. and wipe down all visible surfaces of your interior.  
            Next your interior will get a treatment with our interior protectant for Vinyl, Rubber, and Plastic.  If you are a leather owner your leather will also be cleaned and treated.
            Lastly your windows will be cleaned to a nice shine. This option is for customers who don't want a detail but with a little more than what our other Dash option offer, 
            this will get most nooks and cranies and get you back on the road feeling more refreshed than our other Dash options!
            </div>
            
            <div className='info-section-content-title2'>Interior Details</div>
    
            <div className='flex-row'>
                <div className='info-section-content-service1'>Interior Basic Detail</div>
                <div className='info-section-content-price1'><div className='basic-underline'><DollarSign/>155 Car / Truck</div> &nbsp; | &nbsp; <div className='advanced-underline'><DollarSign/>165 Suv / Mini Van</div></div>
            </div>
            <div className='info-section-content-description-1'>
            For this Interior option, We will remove and clean your floormats.  We will Vacuum your entire interior front to back and front again. 
            Next we will clean shampoo and extract all fabric carpets and surfaces. We will scrub and wipe down all surfaces of your interior aswell as steam clean.  
            Next your interior will get a treatment with our interior protectant for Vinyl, Rubber, and Plastic.  If you are a leather owner your leather will also be cleaned and treated.
            Lastly your windows will be cleaned to a perfect shine. This option is for customers who want a completee interior detail for than new car feeling, and maybe if smell if that what sent you choose. 
            This will get every nook and crany and have you back on the road feeling like the first day you bought it, possibly better!
            </div>
        </div>
        <Disclaimer/>
    </>
  )
}

export default InteriorDetail