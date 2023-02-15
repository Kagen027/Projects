import React from 'react'
import '../../CSS/Reusables/BestPics.css'

function BestPics(props) {
  return (
    <div><img className={props.imageClass} src={props.imageUrl}/></div> 
  )
}

export default BestPics