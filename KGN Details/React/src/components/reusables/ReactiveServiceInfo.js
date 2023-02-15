import React, {useState} from 'react'
import "../../css/reusables/ReactiveServiceInfo.css"
import CompleteDetails from './ReactiveServiceInfoSections/CompleteDetails';
import ExteriorDetail from './ReactiveServiceInfoSections/ExteriorDetail';
import ExtraDetails from './ReactiveServiceInfoSections/ExtraDetails';
import InteriorDetail from './ReactiveServiceInfoSections/InteriorDetail';

function ReactiveServiceInfo() {
    const serviceOptions = [
        {
            id: 1,
            title: "Exterior",
            content: <ExteriorDetail/>
        },
        {
            id: 2,
            title: "Interior",
            content: <InteriorDetail/>
        },
        {
            id: 3,
            title: "Complete",
            content: <CompleteDetails/>
        },
        {
            id: 4,
            title: "Standalones",
            content: <ExtraDetails/>
        }
    ]

    const [toggled, setToggled] = useState(1)
    
  return (
    <>
    <div id='service-info-container'>
        <div id='service-button-container' className='flex-row'>
            {   
                serviceOptions.map(({title,id}) => {
                    return(
                        <button className='service-button' onClick={() => setToggled(id)} >{title}</button>
                    ) 
                })
             }
        </div>
     </div>
     <div id='service-details-container' className='flex-col'>
            {
                serviceOptions.map(({content, id}) => {
                    return(
                        <>
                        {toggled === id ? (
                            <div className='full flex-col'>{content}</div>
                        ) : null}
                        </>
                    )
                })

            }
        </div>
    </>
  )
}

export default ReactiveServiceInfo