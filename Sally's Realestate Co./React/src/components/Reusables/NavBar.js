import React, {useRef} from 'react'
import '../../CSS/Reusables/NavBar.css'
import {FaHome} from 'react-icons/fa';

const NavBar = ()=> {
  const navRef = useRef();
  return (
	<div>
      <header className='colors'>
        <h3><FaHome/>&nbsp;Sally's Real Estate Co.</h3>
		<div>
        	<nav ref={navRef}>
				<a href="/">Home</a>
				<a href="/ForSale">For Sale</a>
				<a href="/Rent">For Rent</a>
				<a href="/SignIn">Sign In</a>
				<a href="/SignUp">Sign Up</a>
			</nav>
		</div>
		</header>
	</div>
  )
}

export default NavBar