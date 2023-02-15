import React from 'react'
import '../../css/reusables/BestPic.css'

function BestPics(props) {
  return (
    <div><img className={props.imageClass} src={props.imageUrl} alt = 'Car Detailing Pictures'/></div> 
  )
}

export default BestPics