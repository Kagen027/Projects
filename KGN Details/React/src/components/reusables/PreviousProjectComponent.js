import React from 'react'
import "../../css/reusables/PreviousProjectsComponent.css"
import { useNavigate } from 'react-router-dom'
function PreviousProjectComponent(props) {
  
  const url = "/Portfolio/" + (props.previousProject.id);  
  
  const navigate = useNavigate()

  const clickHandler = () =>{
        navigate(url)
   }  

  return (
    <div id="previous-project-box"className="flex-col" onClick={() => clickHandler()}>
    <div id='shadow-box' className='flex-col'>
        <div id= "title-box" className="flex-col fill-title">
            <div className="previous-project-title">{props.previousProject.year} {props.previousProject.make} {props.previousProject.model}</div>
            <div className="previous-project-detail-title">Detail Package: {props.previousProject.detailType}</div>
        </div>
        {/* <div className="flex-col">
            <div id= "title-box" className="flex-row space2">
                <div className="discount"><div className="explenation">!!</div>&nbsp;House Hunter Special 10% Off&nbsp;<div className="explenation">!!</div></div>
                <div id= "reduced-price" className="justify-right full-width"><div className="dollar">$</div><div className="price">{TenPercent(props.house.price)}</div></div>
            </div>
        </div> */}
        <img id="previous-img"src={props.previousProject.picMain} alt = "Previous Project Car"/>
    </div>
</div> 
  )
}

export default PreviousProjectComponent