import React from 'react'
import '../../css/reusables/SocialMediaTile.css'

function SocialMediaTile(props) {
  return (
    <div className={props.TileClass}>
    <div className='social-media-circle'>
      <img src={props.ImageName} alt="social media tile"/> 
      <div className='socialmedia-call-action'>{props.ActionCall}</div> 
    </div>
  </div>
  )
}

export default SocialMediaTile