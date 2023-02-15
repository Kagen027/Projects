import React from 'react'
import '../../CSS/Reusables/HousesComponentOverNinety.css'

const TenPercent = (ogPrice) =>{
    const tenPerc = ogPrice/10
    const solution = ogPrice-tenPerc
    const newPrice = Math.trunc(solution)
    const finalPrice = newPrice.toLocaleString("en-US")
    return finalPrice
}

const NumbFormatter = (ogNumb) =>{
    const formattedNumber = ogNumb.toLocaleString("en-US");
    return formattedNumber
}

const TimeFormatter = (sqlTime) =>{
    const empty = []
    const sepperated = sqlTime.split('T')
    const dateRaw = sepperated [0]
    const dateNew = dateRaw.split('-')
    const dateFinal = empty.concat(dateNew[1],'/',dateNew[2],'/',dateNew[0])
    return dateFinal
}

function HouseComponentOverNinety(props) {
    return (
    <div id="house-box"className="flex-col">
        <div id='shadow-box' className='flex-col'>
            <div id= "title-box" className="flex-row space2">
                <div className="address">{props.house.houseNumber} {props.house.streetName}</div>
                <div className="justify-right full-width"><div className="dollar">$</div><div className="price-90">{NumbFormatter(props.house.price)}</div></div>
            </div>
            <div className="flex-col">
                <div id= "title-box" className="flex-row space2">
                    <div className="discount"><div className="explenation">!!</div>&nbsp;House Hunter Special 10% Off&nbsp;<div className="explenation">!!</div></div>
                    <div id= "reduced-price" className="justify-right full-width"><div className="dollar">$</div><div className="price">{TenPercent(props.house.price)}</div></div>
                </div>
            </div>
            <div className="flex-col">
                <div>City:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{props.house.city}</div>
                <div>State: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{props.house.state}</div>
                <div>Zipcode: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{props.house.zipCode}</div>
                <div>Size:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{props.house.squareFeet} sqft</div>
                <div>Posted:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; {TimeFormatter(props.house.timeOfListing)}</div>
                <div id= "title-box" className="flex-row">
                    <div className="add-width">Contact:   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Agent Info</div>
                    <div className="justify-right full-width"><button onclick=""className="button-1" role="button">Details</button></div>  
                </div>  
            </div>
            <img src={props.house.picture} />
        </div>
    </div> 
    )
}
  
export default HouseComponentOverNinety