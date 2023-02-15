import React, {useRef, useState, useEffect} from 'react'
import '../../css/reusables/NavBarHome.css'
import {FaCaretDown} from 'react-icons/fa';
import Splash from './Splash';
import Modal from './Modal';

const NavBarHome = (props) => {
  
  const navRef = useRef();

  const [isLoading, setIsLoading] = useState(true)
  const [isModalShowing, setIsModalShowing] = useState(false)

  useEffect(() => {
    const email = localStorage.getItem("email")
    if(email === null){
      setIsLoading(false)
    }else{
      setIsLoading(false)
    }
  }, []);

  const toggleModal = () => {
    if(isModalShowing){
      // Following line makes it so when Modal is active the page is not Scrollable
      document.body.style.overflow = "hidden";
      return(
        <Modal isModalShowing={isModalShowing} setIsModalShowing={setIsModalShowing} modalClass={"modal"} contentClass={"modal-content"}>
            <div className='signout-modal-message flex-col'>
              <div className='center margin-bottom-25'>
                <div className='underline'>{props.customer.firstName}</div>
                <div className='center'>, Are you sure you want to sign out?</div>
              </div>
                <div className='align-self-center'><button className="button-66-red align-self-center" onClick={signOut}>Sign Out</button></div>
            </div>
        </Modal>
      )
    }else{
      return(
      null
      )
    }
  }

  const onClick = (event) => {

    setIsModalShowing(true)
  }

  const signOut = () => {
    localStorage.removeItem("email")
    props.setCustomer(null)
    document.body.style.overflow = "auto";
    window.location.reload()
  }

  const renderNavBarHome = () => {

    if(isLoading) {
        return(
          <div id='nav-bar' className='nav-colors'>
            <nav ref={navRef}>
                  <div className='third-perc center left'>
                  </div>
                  <div className='third-perc center'>
                  </div>
                  <div className='third-perc center right'>
                  </div>
            </nav>
        </div>
        )
    }else if(props.customer === null){
          return (
            <div id='nav-bar-home' className='nav-colors'>
                  <nav ref={navRef}>
                        <div className='third-perc center left'>
                        <Splash size={"nav-size" } margin={"nav-margin"}/>
                        </div>
                        <div className='third-perc center'>
                            <a href="/">Home</a>
                            <a href="/Services">Services</a>
                            <a href="/Portfolio">Portfolio</a>
                            <a href="/Testimonials">Testimonials</a>
                            <a href="/Quote">Quote</a>
                        </div>
                        <div className='third-perc center right'>
                            <a href="/SignIn">Sign In</a>
                            <a href="/SignUp">Sign Up</a>
                        </div>
              </nav>
            </div>
          )
    }else {
      return (
        <div id='nav-bar-home' className='nav-colors'>
        <nav ref={navRef}>
              <div className='third-perc center left'>
              <Splash size={"nav-size" } margin={"nav-margin"}/>
              </div>
              <div className='third-perc center'>
                  <a href="/">Home</a>
                  <a href="/Services">Services</a>
                  <a href="/Portfolio">Portfolio</a>
                  <a href="/Testimonials">Testimonials</a>
                  <a href="/Quote">Quote</a>
              </div>
              <div className='third-perc center right'>
              <div className='flex-col customer-signout'>
                <div className='justify-right'>{props.customer.firstName} {props.customer.lastName} <FaCaretDown className='down-caret'/></div>
                <button className="sign-out" onClick={onClick}>Sign Out</button>
              </div>
            </div>
            {toggleModal()}
    </nav>
</div>
      )
    }
  }
    
  return(
    <>
    {renderNavBarHome()}
    </>
  )
 

} 
  



export default NavBarHome