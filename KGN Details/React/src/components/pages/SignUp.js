import axios from 'axios';
import React from 'react'
import { useNavigate } from 'react-router'
import "../../css/pages/SignUp.css"
import { useState } from 'react';
import Splash from '../reusables/Splash';

function SignUp() {
    const navigate = useNavigate();

    const [customer, setCustomer] = useState({
      firstName: "",
      lastName: "",
      email: "",
      phone: "",
      password: ""
    })
  
    const changeHandler = (event) =>{
      const name = event.target.name
      const value = event.target.value
      const temptCustomer = {...customer}
      temptCustomer[name] = value
      setCustomer(temptCustomer)
    }
  
    const sumbitHandler = () => {
      axios.post('http://localhost:8080/createCustomer', customer)
      .then((response) => {
        navigate("/SignIn")
    }).catch((e) => {
        console.log(e)
    })
  
    }
  
  return (
    <div className="signup-contents">
        <div className="signup-form-box flex-col">
            <h1 className="flex-row center signup-form-h1">Sign Up For <Splash size={"nav-size" } margin={"nav-margin"}/></h1>
            <div className='flex-col sinup-form-container'>
            <div className="quote-form flex-col">
                        <input className="input1" type="text" placeholder='First Name' onChange={changeHandler} name='firstName' value={customer.firstName} required="true" />
                        <input className="input1" type="text" placeholder='Last Name' onChange={changeHandler} name='lastName' value={customer.lastName} required="true" />
                        <input className="input1" type="email" placeholder='Email' onChange={changeHandler} name='email' value={customer.email} required="true" />
                        <input className='input1' type="tel" placeholder="Phone 123-123-4567" onChange={changeHandler} name='phone' value={customer.phone} pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required="true" />
                        <input className="input1" type="password" placeholder='Password' onChange={changeHandler} name='password' value={customer.password} required="true" />
                    </div>
                    <div className='align-self-center margin-top-35'>
                        <button className='button-66' type="submit" onClick={sumbitHandler}>Submit</button>
                    </div>
                    <p className="para-2 align-self-center margin-top-35"><strong>Already Have An Account? <a className='a-link-signIn' href="SignIn"> Sign In</a></strong></p>
                </div>


            <div id="link-container"class="center bottom">
                    <div><a href="/" class="flex-row links-bottom">Home</a></div>
                    <div><a href="/Services" class="flex-row links-bottom">Services</a></div>
                    <div><a href="/Portfolio" class="flex-row links-bottom">Portfolio</a></div>
                    <div><a href="/Testimonals" class="flex-row links-bottom">Testimonals</a></div>
            </div>
        </div>
</div>
  )
}

export default SignUp