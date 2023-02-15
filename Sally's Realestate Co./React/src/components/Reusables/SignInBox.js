import React from 'react'
import '../../CSS/Reusables/SignUpBox.css'
import { useNavigate } from 'react-router';
import { useState } from 'react';
import axios from 'axios';


function SignInBox() {
  const navigate = useNavigate();

  const [user, setUser] = useState({
    emailAddress: "",
    password: "",
  })

  const changeHandler = (event) =>{
    const name = event.target.name
    const value = event.target.value
    const temptUser = {...user}
    temptUser[name] = value
    setUser(temptUser)
  }

  const sumbitHandler = () => {
    axios.post('http://localhost:8080/signIn', user)
    .then((response) => {
      navigate("/")
  }).catch((e) => {
      console.log(e)
  })

  }



  return (
    <div class="contents">
        <div class="login-box">
            <h1>Login</h1>
            <div className="form flex-col">
                <label class="label">Email</label>
                <input className="input1" type="email" onChange={changeHandler} name='emailAddress' value={user.emailAddress}/>
                <label className="label">Password</label>
                <input className="input1" type="password" onChange={changeHandler} name='password' value={user.password}/>
                <button type="submit" onClick={sumbitHandler}>Submit</button>
            </div>
        </div>
        <p className="para-2"><strong>Create An Account? <a href="SignUp"> SIGN UP</a></strong></p>
    </div>
  )
}

export default SignInBox