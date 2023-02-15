import React from 'react'
import '../../css/reusables/ResponsiveTile.css'
import { useNavigate } from 'react-router-dom'



function ResponsiveTile(props) {
  
  const navigate = useNavigate()
  
  const serviceHandler = () =>{
  navigate(props.Url)
  }

  return (
    <div id='responsive-tile'className='flex-col' onClick={() => serviceHandler()}>
      <img id={props.PicId} src= {props.PicName} alt = "Responsive Tile"/>
      <div id='tile-call-action'>{props.Title}</div>
      <div id='tile-discrition-container' className='flex-col'><div id='tile-discrition'>{props.Line1}</div><div id='tile-discrition'>{props.Line2}</div><div id='tile-discrition'>{props.Line3}</div></div>
      <button className='tile-button'>{props.ButtonName}</button>
    </div>
  )
}

export default ResponsiveTile