import { Routes, Route } from 'react-router-dom'
import './App.css';
import NavBar from './components/Reusables/NavBar';
import Home from './components/Pages/Home'
import SignIn from './components/Pages/SignIn';
import SignUp from './components/Pages/SignUp';
import ForSale from './components/Pages/ForSale';


function App() {
  return (
    <router>
      <NavBar/>
      <Routes>
        <Route path='/'  element={<Home/>} />
        <Route path='/SignIn'  element={<SignIn/>} />
        <Route path='/SignUp'  element={<SignUp/>} />
        <Route path='/ForSale'  element={<ForSale/>} />
      </Routes>
    </router>
    
     
    
  );
}

export default App;
