package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectDetails;
import com.saqib.projecttaskmanagement.repository.ProjectDetailsRepository;
import com.saqib.projecttaskmanagement.repository.ProjectRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProjectDetailsService extends ProjectDetailsRepository {

    List<ProjectDetails> saveProjectDetails(List<ProjectDetails> projectDetailsList);
    List<ProjectDetails> findByProject(Optional<Project> project);

    @Query("Select p from ProjectDetails p where p.project =:project")
    List<ProjectDetails> findProjectDetailsByProjectId(@Param("project") Optional<Project> project);
}
