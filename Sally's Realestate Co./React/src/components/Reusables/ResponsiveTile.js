import React from 'react'
import '../../CSS/Reusables/ResponsiveTile.css'

function ResponsiveTile(props) {
  return (
    <div typeof='button' id='responsive-tile'className='flex-col' onclick="/">
      <img id='tile-picture'src='https://img.freepik.com/free-vector/doodle-house-cartoon-design_1308-106805.jpg'/>
      <div id='tile-call-action'> Buy Your Dream Home</div>
      <div id='tile-discrition-container' className='flex-col'><div id='tile-discrition'>Here at Sally's Real Estate Co. we believe </div><div id='tile-discrition'>your dream home has already found you. Now</div><div id='tile-discrition'>you just have to find it,  Let us help you!</div></div>
      <button id='tile-button'>Buy Home</button>
    </div>
  )
}

export default ResponsiveTile