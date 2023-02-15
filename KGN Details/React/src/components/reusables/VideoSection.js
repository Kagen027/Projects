import React from 'react'
import "../../css/reusables/VideoSection.css"
import videobg from '../../assets/videos/HomePagevid1.mp4'
import Splash from './Splash'

function VideoSection() {
  return (
    <div className='video-container flex-col'>
        <video className='home-video' src={videobg} autoPlay loop muted/>
        <div className='flex-col'>
            <div className='video-content' >Welcome</div>
            <div className='video-content-small' >To&nbsp; <Splash size={"vid-size" } margin={"vid-margin"}/></div>
        </div>
        
    </div>
  )
}

export default VideoSection