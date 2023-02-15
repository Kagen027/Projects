import React from 'react'
import "../../../css/reusables/ReactiveServiceInfoSections/Disclaimer.css"

function Disclaimer() {
  return (
   <>
    <div id='disclaimer-container' className='flex-col'>
        <div className='flex-row disclaimer-row'>
            <div id='explenation-disclaimer' className='just-right'>!!</div>
            <div id='disclaimer'>Disclaimer: Additional Fees may be applied at time of drop off for the following</div>
            <div id='explenation-disclaimer' className='just-left'>!!</div>
        </div>
        <div className='flex-col disclaimer-content-container'>
            <div className='disclaimer-content'>• Excessive Pet Hair</div>
            <div className='disclaimer-content'>• Biohazard Cleaning (bodily fluids, mouse or rodent remnants, needles, etc)</div>
            <div className='disclaimer-content'>• Excessive Mud or Dirt on Exterior and/or Interior</div>
            <div className='disclaimer-content'>• Excessive staining or extensive interior cleaning</div>
        </div>
        <div className='flex-row disclaimer-row'>
            <div id='note'>**Note: Engine cleaning will only be performed by hand washing due to intricate and sophisticated automotive electronics**</div>
        </div>
    </div>
   </>
  )
}

export default Disclaimer