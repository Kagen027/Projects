import React, { useState } from 'react'
import "../../css/reusables/PreviousProjectDetails.css"
import {FaArrowAltCircleLeft, FaArrowAltCircleRight} from 'react-icons/fa';

function PreviousProjectDetails(props) {
    const [current, setCurrent] = useState(0)
    const allPics = [
        {
            id: 0,
            content: (props.previousProject.picOne)
        },
        {
            id: 1,
            content: (props.previousProject.picTwo)
        },
        {
            id: 2,
            content: (props.previousProject.picThree)
        },
        {
            id: 3,
            content: (props.previousProject.picFour)
        },
        {
            id: 4,
            content: (props.previousProject.picFive)
        },
        {
            id: 5,
            content: (props.previousProject.picSix)
        },
        {
            id: 6,
            content: (props.previousProject.picSeven)
        },
        {
            id: 7,
            content: (props.previousProject.picEight)
        },
        {
            id: 8,
            content: (props.previousProject.picNine)
        },
        {
            id: 9,
            content: (props.previousProject.picTen)
        },

    ];
    
    const nonNullPics = allPics.filter(picture => {
        return picture.content !== null;
    })
   
    const length = nonNullPics.length

    const nextSlide = () => {
       setCurrent(current === length -1 ? 0 : current + 1) 
    }

    const prevSlide = () => {
        setCurrent(current === 0 ? length -1 : current -1) 
     }

    console.log(current)
    return (
        <div id="project-details-box"className="flex-col">
            <div id= "project-details-title-box" className="flex-col">
                <div className="project-details-title">{props.previousProject.year} {props.previousProject.make} {props.previousProject.model}</div>
                <div className="project-details-info">{props.previousProject.detailType} Package</div>
            </div>
            {/* <div className="flex-col">
                <div id= "title-box" className="flex-row space2">
                    <div className="discount"><div className="explenation">!!</div>&nbsp;House Hunter Special 10% Off&nbsp;<div className="explenation">!!</div></div>
                    <div id= "reduced-price" className="justify-right full-width"><div className="dollar">$</div><div className="price">{TenPercent(props.house.price)}</div></div>
                </div>
            </div> */}
            <div className='slider flex-row'>
                <FaArrowAltCircleLeft className='left-arrow' onClick={prevSlide}/>
                
                {nonNullPics.map(({content}, index) =>{
                    return(
                        <div className={index === current ? 'slide active' : "slide"}  key = {index}>
                            {index === current && (<img src={content} className="slider-image" alt="Slides" />)}
                            
                        </div>
                    )
                })
                }

                <FaArrowAltCircleRight className='right-arrow' onClick={nextSlide}/>
            </div>
    </div> 
      )
}

export default PreviousProjectDetails