import React from 'react'
import "../../css/reusables/Splash.css"

function Splash(props) {
  return (
    <div className={props.size}>
        <div className='KGN'>KGN</div>
        <div className={props.margin}>Details</div>
    </div>
    
  )
}

export default Splash