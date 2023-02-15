import React from 'react'
import AdminHeater from './AdminHeater'
import '../../CSS/Reusables/AdminTable.css'
import {useState} from 'react'
import {useNavigate} from 'react-router'
import { useEffect } from 'react'
import axios from 'axios';


function AdminUser() {
    const [allUsers,setAllUsers] = useState([])


    useEffect(() => {
      axios.get("http://localhost:8080/viewAllUser")
        .then((response) => {
          setAllUsers(response.data)
        })
        .catch((e) =>{
          console.log(e)
        })

    },[])
      
    const navigate = useNavigate();

    const [user, setUser] = useState({
        firstName: "",
        lastName: "",
        emailAddress: "",
        password: "",
        confirmPassword: "",
        admin: ""
      })

    const changeHandler = (event) => {
        const name = event.target.name
        const value = event.target.value
        const tempUser = {...user}
        tempUser[name] = value
        setUser(tempUser)
    }
    const sumbitHandler =()=> {
        axios.post('http://localhost:8080/signUp', user)
            .then((response) =>{
                navigate("/")
            })
            .catch((e) => {
                console.log(e)
            },[])
    }

  return (
    <div>
        <AdminHeater/>
        <div className='table-box flex-col'>
        <table className='table flex-col'>
        <thead>
        <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Confirm Password</th>
        <th>Admin</th>
        <th>Action</th>
        </tr>
        </thead>
        <tbody>
          {
            allUsers.map((user) => {
              return(
                <tr>
                  <td>{user.id}</td>
                  <td>{user.firstName}</td>
                  <td>{user.lastName}</td>
                  <td>{user.emailAddress}</td>
                  <td>{user.password}</td>
                  <td>{user.confirmPassword}</td>
                  <td>{user.admin  ? "true" : "false"}</td>
                </tr>
              )
            })
          }
          <tr>
            <td></td>
            <td><input className="input" type="text" onChange={changeHandler} name='firstName' value={user.firstName}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='lastName' value={user.lastName}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='emailAddress' value={user.emailAddress} /></td>
            <td><input className="input" type="text" onChange={changeHandler} name='password' value={user.password}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='confirmPassword' value={user.confirmPassword}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='admin' value={user.isAdmin}/></td>
            <td>
                <button type="submit" onClick={sumbitHandler}>Add</button>
            </td>
          </tr>
        </tbody>
        
      </table>
    </div>
    </div>

  )
}

export default AdminUser;