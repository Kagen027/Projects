import React from 'react'
import AdminHeater from '../Reusables/AdminHeater'
import '../../CSS/Reusables/AdminTable.css'
import { useEffect } from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import axios from 'axios'


function adminHouse() {
  const [allHouse,setAllHouse] = useState([])


  useEffect(() => {
    axios.get("http://localhost:8080/viewHouses")
      .then((response) => {
        setAllHouse(response.data)
      })
      .catch((e) =>{
        console.log(e)
      })

  },[])
    
  const navigate = useNavigate();

  const [house, setHouse] = useState({
      houseNumber: "",
      streetName: "",
      city: "",
      state: "",
      zipCode: "",
      price: "",
      numOfBeds: "",
      numOfBaths: "",
      squareFeet: "",
      forSale: "",
      sold: "",
      forRent: "",
      rented: "",
      timeOfListing: "",
      timeSold:"",
      picture:" "
    })

  const changeHandler = (event) => {
      const name = event.target.name
      const value = event.target.value
      const tempUser = {...house}
      tempUser[name] = value
      setHouse(tempUser)
  }
  const sumbitHandler =()=> {
      axios.post('http://localhost:8080/createHouse', house)
          .then((response) =>{
              setHouse(response.data)
              navigate("/")
          })
          .catch((e) => {
              console.log(e)
          })
          
  }



  const deleteHandler = (event) => {
    axios.delete(`http://localhost:8080/deleteByHouseId/${event.target.value}`)
    .then((response) => {
        // navigate('/House')
    })
     .catch((e) =>{
      console.log(3)
     })

     axios.get("http://localhost:8080/viewHouses")
      .then((response) => {
        setAllHouse(response.data)
      })
      .catch((e) =>{
        console.log(e)
      })
  }







  return (
    <div>
        <AdminHeater/>
        <div className='table-box flex-col'>
            <table className='table flex-col'>
                <thead>
                <tr>
                <th>ID</th>
                <th>House Number</th>
                <th>Street Name</th>
                <th>City</th>
                <th>State</th>
                <th>Zip Code</th>
                <th>Price</th>
                <th>Square Feet</th>
                <th>Bathroom</th>
                <th>Bedroom</th>
                <th>For Sale</th>
                <th>sold</th>
                <th>forRent</th>
                <th>rented</th>
                <td>timeOfListing</td>
                <td>timeSold</td>
                <td>picture</td>
                <th>Action</th>
                </tr>
            </thead>
        <tbody>
        {
            allHouse.map((house) => {
              return(
                <tr>
                  <td>{house.id}</td>
                  <td>{house.houseNumber}</td>
                  <td>{house.streetName}</td>
                  <td>{house.city}</td>
                  <td>{house.state}</td>
                  <td>{house.zipCode}</td>
                  <td>{house.price}</td>
                  <td>{house.numOfBeds}</td>
                  <td>{house.numOfBaths}</td>
                  <td>{house.squareFeet}</td>
                  <td>{house.forSale  ? "true" : "false" }</td>
                  <td>{house.sold  ? "true" : "false"}</td>
                  <td>{house.forRent  ? "true" : "false"}</td>
                  <td>{house.rented  ? "true" : "false"}</td>
                  <td>{house.timeOfListing}</td>
                  <td>{house.timeSold}</td>
                  <td>{house.picture}</td>
                  <td>
                      <button value={house.id} onClick={deleteHandler}>delete</button>
                  </td>
                </tr>
              )
            })
          }
          
          
          <tr>
            <td></td>
            <td><input className="input" type="text" onChange={changeHandler} name='houseNumber' value={house.houseNumber}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='streetName' value={house.streetName}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='city' value={house.city}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='state' value={house.state}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='zipCode' value={house.zipCode}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='price' value={house.price}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='numOfBeds' value={house.numOfBeds}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='numOfBaths' value={house.numOfBaths}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='squareFeet' value={house.squareFeet}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='forSale' value={house.forSale}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='sold' value={house.sold}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='forRent' value={house.forRent}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='rented' value={house.rented}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='timeOfListing' value={house.timeOfListing}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='timeSold' value={house.timeSold}/></td>
            <td><input className="input" type="text" onChange={changeHandler} name='picture' value={house.picture}/></td>
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

export default AdminHouse
