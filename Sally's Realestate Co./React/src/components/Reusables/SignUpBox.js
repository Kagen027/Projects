import axios from 'axios';
import React from 'react'
import { useNavigate } from 'react-router'
import "../../CSS/Reusables/SignUpBox.css"
import { useState } from 'react';

function SignUpBox() {
  const navigate = useNavigate();

  const [user, setUser] = useState({
    firstName: "",
    lastName: "",
    emailAddress: "",
    password: "",
    confirmPassword: ""
  })

  const changeHandler = (event) =>{
    const name = event.target.name
    const value = event.target.value
    const temptUser = {...user}
    temptUser[name] = value
    setUser(temptUser)
  }

  const sumbitHandler = () => {
    axios.post('http://localhost:8080/signUp', user)
    .then((response) => {
      navigate("/SignIn")
  }).catch((e) => {
      console.log(e)
  })

  }

  return (
    <div className="contents">
        <div className="sign-box flex-col">
            <h1 className="flex-col">SIGN UP</h1>
           <p><strong>It's free and only takes a minute!</strong></p>
           <div className='flex-col'>
           <div className="form flex-col">
                    <label className="label">First Name:</label>
                    <input className="input1" type="text" onChange={changeHandler} name='firstName' value={user.firstName}/>
                    <label className="label">Last Name:</label>
                    <input className="input1" type="text" onChange={changeHandler} name='lastName' value={user.lastName}/>
                    <label className="label">Email:</label>
                    <input className="input1" type="email" onChange={changeHandler} name='emailAddress' value={user.emailAddress}/>
                    <label className="label">Password:</label>
                    <input className="input1" type="password" onChange={changeHandler} name='password' value={user.password}/>
                    <label className="label">Confirm Password:</label>
                    <input className="input1" type="password" onChange={changeHandler} name='confirmPassword' value={user.confirmPassword}/>
                </div>
                <div>
                    <button type="submit" onClick={sumbitHandler}>Submit</button>
                </div>
                <p className="para-2"><strong>Have An Account? <a href="SignIn"> Sign In</a></strong></p>
            </div>
            </div>
    </div>

  )
}

export default SignUpBox