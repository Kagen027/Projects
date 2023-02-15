import axios from 'axios';
import React from 'react'
import { useNavigate } from 'react-router'
import "../../css/pages/SignUp.css"
import { useState } from 'react';
import Splash from '../reusables/Splash';

function SignIn(props) {
    const navigate = useNavigate();

    const [error, setError] = useState(null)

    const [customer, setcustomer] = useState({
      email: "",
      password: ""
    })
  
    const changeHandler = (event) =>{
      const name = event.target.name
      const value = event.target.value
      const temptcustomer = {...customer}
      temptcustomer[name] = value
      setcustomer(temptcustomer)
    }
  
    const sumbitHandler = () => {
      axios.post('http://localhost:8080/signIn', customer)
      .then((response) => {
        localStorage.setItem("email", response.data.email)
        props.setCustomer(response.data)
        navigate('/')
    }).catch((e) => {
        console.log(e.response)
        setError(e.response.data)
    })
  
    }
  
  return (
    <div className="signup-contents">
        <div className="signup-form-box flex-col">
            <h1 className="flex-row center signup-form-h1">Sign In To <Splash size={"nav-size" } margin={"nav-margin"}/></h1>
            <div className='flex-col sinup-form-container'>
            <div className="quote-form flex-col">
                        <input className="input1" type="email" placeholder='Email' onChange={changeHandler} name='email' value={customer.email}/>
                        <input className="input1" type="password" placeholder='Password' onChange={changeHandler} name='password' value={customer.password}/>
                    </div>

                    {error && (
                        <div className='error-signIn'>
                        An error has occurred: {error}
                        </div>
                    )}

                    <div className='align-self-center margin-top-35'>
                        <button className='button-66' type="submit" onClick={sumbitHandler}>Submit</button>
                    </div>
                    <p className="para-2 align-self-center margin-top-35"><strong>Don't Have An Account? <a className='a-link-signIn' href="SignUp"> Sign Up</a></strong></p>
                </div>


            <div id="link-container"className="center bottom">
                    <div><a href="/" className="flex-row links-bottom">Home</a></div>
                    <div><a href="/Services" className="flex-row links-bottom">Services</a></div>
                    <div><a href="/Portfolio" className="flex-row links-bottom">Portfolio</a></div>
                    <div><a href="/Testimonals" className="flex-row links-bottom">Testimonals</a></div>
            </div>
        </div>
</div>
)
}

export default SignIn