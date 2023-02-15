import React from 'react'
import ReactPlayer from 'react-player';
import video from '../../../src/assets/videos/video.mp4'
import '../../CSS/Reusables/HeroComponent.css'
import {FaSearch} from 'react-icons/fa';

function HeroComponent() {
  return (
    <section className='hero'>
        <div className='overlay'></div>
        <ReactPlayer className='full' url={video} playing loop muted/>
        <div className='heroContent container'>
            <div className='texDiv'>
                <h1 className='title'>
                    Search Your Dream Home
                </h1>
            </div>
            <div className='cardDiv grid'>
                <div className='SearchInput'>
                    <div className='input flex'>
                        <input id='hero-input' type='text' placeholder='Enter Your City Here'></input>
                        <div id='hero-search'><FaSearch/></div>
                    </div>

                </div>

            </div>
        </div>
        
    </section>
  )
}

export default HeroComponent