import React from 'react'
import "../../css/reusables/Modal.css"

function Modal(props) {
    
    const xHandler = () => {
        document.body.style.overflow = "auto";
        props.setIsModalShowing(false)
        props.setIsModalShowingQuote(false)
      }

    return (
        <div id="myModal" className={props.modalClass}>
            <div className={props.contentClass}>
                <span className="close"><button className='modal-signout-x' onClick={xHandler}>X</button></span>
                {props.children}
            </div>
        </div>
    )
}

export default Modal