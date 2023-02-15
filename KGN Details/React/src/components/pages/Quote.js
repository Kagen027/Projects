import React, { useState, useEffect} from 'react'
import { useNavigate } from 'react-router'
import NavBar from '../reusables/NavBar'
import PhotoHeader from '../reusables/PhotoHeader'
import LoadingSpinner from "../reusables/LoadingSpinner.js"
import "../../css/pages/Quote.css"
import QuoteContent from '../reusables/QuoteContent'


function Quote(props) {
  const navigate = useNavigate();

  const [isSignedIn, setIsSignedIn] = useState(false);
  const [isLoading, setIsLoading] = useState(true)

  useEffect(() => {
    const email = localStorage.getItem("email")
    if(email === null||email === {}){
      setIsLoading(false)
    }else{
      setIsSignedIn(true)
      setIsLoading(false)
    }
  }, []);

  const signInHandler = () => {
    navigate('/SignIn')
  }

  const renderContent = () => {

    if(isLoading) {
        return(
          <div className='flex-col center fill-vertical'><LoadingSpinner/></div>
        )
    }else{

      return(
        <>
        {isSignedIn ? (
          <div>
            <QuoteContent customer={props.customer} setCustomer={props.setCustomer}/>
          </div>
        ) : (
          <>
            <div className='signin-warning flex-col'>
              <div>You must be Signed In to use this feature!</div>
              <div className='align-self-center margin-top-35'>
                <button className='button-66-red' type="submit" onClick={signInHandler}>Sign In</button>
              </div>
            </div>
      
          </>
        )}
        </>
      )

    }
    
  }

  return (
    <>
    <NavBar customer={props.customer} setCustomer={props.setCustomer}/>
    <PhotoHeader headerClassId="photo-header-quote"/>
    {renderContent()}
    
    </>
  )
}

export default Quote