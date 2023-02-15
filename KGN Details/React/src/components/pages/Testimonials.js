import React from 'react'
import '../../css/pages/Testimonials.css'
import NavBar from '../reusables/NavBar'
import PhotoHeader from '../reusables/PhotoHeader'
import {FaQuoteLeft,FaFacebook,FaInstagram,FaTwitter} from 'react-icons/fa';

function Testimonials(props) {
  return (
    <>
      <NavBar customer={props.customer} setCustomer={props.setCustomer}/>
      <PhotoHeader headerClassId = "photo-header-testimonals"/>
      <div id='testimonial-content' className='flex-col'>
          <div className='testimonials-title'>Customer Reviews</div>
          <div className='testimonials-title2'>What Our Customers are saying...</div>
          <div className='flex-row testimony-container'>
            <div className='testimony-box flex-col'>
              <FaQuoteLeft className='quotations'/>
              <div className='testimony-p'>My volkswagen was in dire need of a rejuvenation.  The years and I have not been kind to it.  KGN Details cleaned it up, and returned it better than the day I bought it!</div>
              <div className='testimony-color-block-green flex-col'>
                <div className='testimony-person-name'>Jennifer Fulton</div>
                <div className='flex-row testimony-social'><FaFacebook/><FaInstagram/><FaTwitter/></div>
              </div>
            </div>
            <div className='testimony-box flex-col'>
              <FaQuoteLeft className='quotations-purple'/>
              <div className='testimony-p'>With working out of town my truck get a lot of miles.  KGN is the best at knocking off the grime, keeping my ride fresh and not breaking the bank. Best Bang for Your Buck!</div>
              <div className='testimony-color-block-purple flex-col'>
                <div className='testimony-person-name'>Corey H. Dean</div>
                <div className='flex-row testimony-social'><FaFacebook/><FaInstagram/><FaTwitter/></div>
              </div>
            </div>
            <div className='testimony-box flex-col'>
              <FaQuoteLeft className='quotations-blue'/>
              <div className='testimony-p'>The best thing about KGN is they have something for everyone. Sometimes I just need a quick maintenance wash and other times a complete detail. Both are done by KGN.</div>
              <div className='testimony-color-block-blue flex-col'>
                <div className='testimony-person-name'>Johnny Zimmermann</div>
                <div className='flex-row testimony-social'><FaFacebook/><FaInstagram/><FaTwitter/></div>
              </div>
            </div>
          </div>
        </div>
    </>
  )
}

export default Testimonials