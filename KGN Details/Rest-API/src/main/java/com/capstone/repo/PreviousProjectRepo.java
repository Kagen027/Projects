package com.capstone.repo;


import org.springframework.stereotype.Repository;

import com.capstone.entity.PreviousProject;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface PreviousProjectRepo extends JpaRepository <PreviousProject, Integer>{
    
}
