import { Routes, Route } from 'react-router-dom';
import axios from 'axios';
import Home from "./components/pages/Home"
import './App.css';
import Testimonials from './components/pages/Testimonials';
import Services from './components/pages/Services.js';
import Portfolio from './components/pages/Portfolio';
import PortfolioDetails from './components/pages/PortfolioDetails';
import QuoteDetails from './components/pages/QuoteDetails';
import Quote from './components/pages/Quote';
import SignUp from './components/pages/SignUp';
import SignIn from './components/pages/SignIn';
import { useEffect, useState } from 'react';



function App() {

  const [customer, setCustomer] = useState(null)

  useEffect(() => {

    const email = localStorage.getItem("email")

    if (email !== null){

      axios.get(`http://localhost:8080/getCustomerByEmail/${email}`)
      .then((response) => {

        setCustomer(response.data)
        console.log(response.data)
      })
      .catch((e) => {
        console.log(e.response)
      })
    }

  }, [])

  return (
    <Routes>
      <Route exact path='/' element={<Home customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/Testimonials' element={<Testimonials customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/Quote' element={<Quote customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/Quote/:id' element={<QuoteDetails customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/Services' element={<Services customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/Portfolio' element={<Portfolio customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/Portfolio/:id' element={<PortfolioDetails customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/SignUp' element={<SignUp customer={customer} setCustomer={setCustomer}/>} />
      <Route path='/SignIn' element={<SignIn customer={customer} setCustomer={setCustomer}/>} />
    </Routes>
  );
}

export default App;
