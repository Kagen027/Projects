import React from 'react'
import '../../CSS/Reusables/AdminHeater.css'
import Home from '../Pages/Home'

function DashBoard() {
	
  return (
		<div>
      <header className='colors'>
        <h3>Admin</h3>
		<div>
        <nav>
				<a href="/">Home</a>
				<a href="/AdminHouse">House</a>
				<a href="/AdminUser">User</a>
				<a href="/Sign out">Sign Out</a>
				
			</nav>
		</div>
		</header>
	</div>
  )
}

export default DashBoard