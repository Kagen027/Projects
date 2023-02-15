import React from 'react';
import '../../css/pages/Services.css'
import NavBar from '../reusables/NavBar'
import PhotoHeader from '../reusables/PhotoHeader'
import ReactiveServiceInfo from '../reusables/ReactiveServiceInfo'

function Services(props) {

  return (
    <>
      <NavBar customer={props.customer} setCustomer={props.setCustomer}/>
      <PhotoHeader headerClassId = "photo-header-service"/>
      <div id='services-intro-container' className='flex-col'>
      <div className='services-intro-title'>Automotive Detailing Services</div>
      <div className='services-intro-discription'>At KGN Details, we deliver the best auto detailing services in Lincoln.&nbsp; We provide 
      multiple packages and options, including a premium hand wash, paint decon and sealing, interior detail, exterior detail, as well as "The Full Works".&nbsp; So, 
      if you're looking for a premium car cleaning service in Lincoln, you better believe KGN will provide fantastic results. &nbsp;Checkout our site or contact us to learn about why
      we are Lincoln's standard for automotive detailing services.</div>
      </div>
      <ReactiveServiceInfo/>
    </>
  )
}

export default Services