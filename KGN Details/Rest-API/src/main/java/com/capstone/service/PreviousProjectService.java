package com.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.PreviousProject;
import com.capstone.repo.PreviousProjectRepo;

@Service
public class PreviousProjectService {
    @Autowired
    PreviousProjectRepo previousProjectRepo;

    //Create previous project
    public PreviousProject createPreviousProject(PreviousProject previousProject){

        return previousProjectRepo.save(previousProject);
    }

    //Get a List of all previous projects
    public List<PreviousProject>viewAllPreviousProject(){
        return previousProjectRepo.findAll();
    }

    //Get a specific previous project by Id
    public PreviousProject getByPreviousProjectId(Integer id){
        return previousProjectRepo.findById(id).get();
    }

    //Delete a specific previous project by Id
    public void deleteByPreviousProjectId(Integer id){
        previousProjectRepo.deleteById(id);
    }
}
