import React from 'react'
import "../../CSS/Reusables/LoadingSpinner.css"

function LoadingSpinner() {
  return (
    <svg id = 'loading-box' className='svg1' viewBox="25 25 50 50">
        <circle className='circle1' r="20" cy="50" cx="50"></circle>
    </svg>
  )
}

export default LoadingSpinner