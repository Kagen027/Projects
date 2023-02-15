import React from 'react'
import {Route, Routes } from 'react-router-dom';
import Home from './Home';



function Admin() {
  return (
    <Routes>
        <Route path='/'  element={<Home/>} />
        <Route path='/House'  element={<House/>} />
        <Route path='/User'  element={<User/>} />
      </Routes>
  )
}

export default Admin