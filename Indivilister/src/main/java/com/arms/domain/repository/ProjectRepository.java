package com.arms.domain.repository;

import com.arms.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProjectRepository  extends JpaRepository<Project, Integer>{

}
