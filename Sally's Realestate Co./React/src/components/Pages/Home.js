import React from 'react'
import HeroComponent from '../Reusables/HeroComponent'
import '../../CSS/Pages/Home.css'
import BestPics from '../Reusables/BestPics'
import ResponsiveTile from '../Reusables/ResponsiveTile'

function Home() {
  return (
    <>
      <HeroComponent/>
      <div id='da-best' className='flex-col'>
        <div id='best-pic' className='flex-row center'>
            <div id='best-place' className='flex-col'>
                <div className='sally-best'>Sally's Real Estate Co.</div>
                <div className='best-slogan'>The best place to buy or rent your next Home!</div>
            </div>
            <BestPics imageUrl={"https://cdn.houseplansservices.com/content/nkfuvivsnfl7mb5eb4fm1ibi8v/w991x660.jpg?v=2"} 
            imageClass={"image-best"} />
            <BestPics imageUrl={"https://static01.nyt.com/images/2019/06/25/realestate/25domestic-zeff/a1c1a1a36c9e4ff8adcb958c4276f28d-jumbo.jpg"} 
            imageClass={"image-best"} />
            <BestPics imageUrl={"https://images.familyhomeplans.com/cdn-cgi/image/fit=scale-down,quality=85/plans/80523/80523-b580.jpg"} 
            imageClass={"image-best"} />
        </div>
      </div>
          <div id='responsive-tile-container' className='flex-row'>
              <ResponsiveTile />
              <ResponsiveTile />
              <ResponsiveTile />
          </div>
    </>
  )
}

export default Home