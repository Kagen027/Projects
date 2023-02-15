import React from 'react'
import '../../css/pages/Home.css'
import BestPics from '../reusables/BestPic'
import ResponsiveTile from '../reusables/ResponsiveTile'
import SocialMediaTile from '../reusables/SocialMediaTile'
import servicesPic from "../../assets/images/pages/Home/ResponsiveTiles/services.png"
import FiveStars from "../../assets/images/pages/Home/ResponsiveTiles/FiveStars.png"
import PreviousWorkPic from "../../assets/images/pages/Home/ResponsiveTiles/PreviousWork.png"
import FacebookCircle from "../../assets/images/pages/Home/facebook.png"
import YoutubekCircle from "../../assets/images/pages/Home/youtube.png"
import InstagramCircle from "../../assets/images/pages/Home/instagram.png"
import VideoSection from '../reusables/VideoSection'
import NavBarHome from '../reusables/NavBarHome'


function Home(props) {
  return (
    <>
      <NavBarHome customer={props.customer} setCustomer={props.setCustomer}/>
      <VideoSection/>
      <div id='luxury' className='flex-col'>
        <div id='luxury-container' className='flex-row center'>
            <div id='luxury-text' className='flex-col center'>
                <div className='luxury-title'>We Care!</div>
                <div className='luxury-slogan'>We treat every car like a Luxury</div>
            </div>
            <BestPics imageUrl={"https://mawdetailcenter.com/wp-content/uploads/2022/05/shine-shop.jpg"}
            imageClass={"image-best"} />
            <BestPics imageUrl={"http://www.tempeautointeriorsrepair.com/wp-content/uploads/2022/07/auto-detailing-car-interior-eps-2048x1367.jpeg"} 
            imageClass={"image-best"} />
            <BestPics imageUrl={"https://images.squarespace-cdn.com/content/v1/5a9eca77af2096c00f9bb77e/1551812957293-8BVPKZ6YG4YMATTRKBRX/Wichita+Clear+Bra+-+Dodge+Challenger+Hellcat+Red+Eye+-+Hellcat+Widebody+-+Wash+-+Car+Wash+-+Foam+Cannon+-+Hand+Wash+-+Ceramic+Pro+-+Ceramic+Coating-125.jpg"} 
            imageClass={"image-best"} />
        </div>
      </div>
      <div id='responsive-tile-container' className='flex-row'>
          <ResponsiveTile 
            PicName={servicesPic} Title={"View Our Services"}
            Line1='Are you looking for Hand Wash and Wax' Line2='Maybe a complete intior rejuvenation' Line3='Check out what we have to offer.'
            Url="/Services" PicId={"tile-picture"} ButtonName={"Services"}
          /> 
          <ResponsiveTile 
            PicName={PreviousWorkPic} Title={"View Our Portfolio"}
            Line1='Not sold yet? Understandable, come' Line2='take a look at our previous work. We let' Line3='our work do the talking.'
            Url="/Portfolio" PicId={"tile-picture-previous"} ButtonName={"Portfolio"}
          />
          <ResponsiveTile 
            PicName={FiveStars} Title={"View Our Testimonals"}
            Line1='Come checkout what our customers have' Line2="to say about us.  Don't take our word" Line3='for it.  Take Theirs!'
            Url="/Testimonals" PicId={"tile-picture-stars"} ButtonName={"Testimonies"}
          />
      </div>
      <div id='why-us-section' className='flex-col'>
        <div id='why-us-title' className='flex-row'>
            <div className='whyus-title1'>Why Trust</div>
            <div className='whyus-title2'>Us?</div>
        </div>  
          <div id='why-us-containers' className='flex-row'>
            <div className='whyus-container1 flex-col'>
              <div className='whyus-container1-title '> Reliable</div>
              <div className='whyus-container1-text '>At KGN our customer's are our No. 1 priorty.  We ensure our standards meet your personal expectations every time!  </div>
          </div>
            <div className='whyus-container2 flex-col'>
              <div className='whyus-container2-title'> Expierence </div>
              <div className='whyus-container2-text '>We have been at this for a while, and our detail profesionals are top in the industry.  Specializing in expectional attention to detail.</div>
            </div>
            <div className='whyus-container3 flex-col'>
              <div className='whyus-container3-title'> Values </div>
              <div className='whyus-container3-text '>We believe in more than just giving you back a clean car.  We believe in giving you an experience that feels like family.</div>
            </div>
          </div>  
        </div>
        <section id='social-media'>
          <SocialMediaTile ImageName={FacebookCircle} TileClass={'facebook'} ActionCall={"LIKE US"}
          />
          <SocialMediaTile ImageName={YoutubekCircle} TileClass={'youtube'} ActionCall={"WATCH US"}
          />
          <SocialMediaTile ImageName={InstagramCircle} TileClass={'instagram'} ActionCall={"FOLLOW US"}
          />
        </section>
    </>
  )
}

export default Home