import React from 'react'
import "../../../css/reusables/ReactiveServiceInfoSections/InfoSectionContent.css"
import Disclaimer from './Disclaimer'
import DollarSign from '../DollarSign'

function ExtraDetails() {
  return (
    <>
     <div id='info-section-content-container' className='flex-col'>
        <div className='info-section-content-title-extra'>Standalone Services</div>

        <div className='flex-row sixfive center'>
            <div className='info-section-content-extras1'>ENGINE BAY CLEANING</div>
            <div className='info-section-content-extras2'><div className='basic-underline'><DollarSign/>35</div></div>
        </div>
        <div className='flex-row sixfive center'>
            <div className='info-section-content-extras1'>HEADLIGHT RESTO</div>
            <div className='info-section-content-extras2'><div className='basic-underline'><DollarSign/>55</div></div>
        </div>
        <div className='flex-row sixfive center'>
            <div className='info-section-content-extras1'>WINDSHIELD CERAMIC COATING</div>
            <div className='info-section-content-extras2'><div className='basic-underline'><DollarSign/>100</div></div>
        </div>
        <div className='flex-row sixfive center'>
            <div className='info-section-content-extras1'>ALL GLASS CERAMIC COATING</div>
            <div className='info-section-content-extras2'><div className='basic-underline'><DollarSign/>200</div></div>
        </div>
      </div>
      <Disclaimer/>
    </>
  )
}

export default ExtraDetails