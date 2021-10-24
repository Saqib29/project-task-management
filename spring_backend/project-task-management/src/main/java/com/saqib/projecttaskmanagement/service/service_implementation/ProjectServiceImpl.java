package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectDetails;
import com.saqib.projecttaskmanagement.repository.ProjectRepository;
import com.saqib.projecttaskmanagement.service.ProjectDetailsService;
import com.saqib.projecttaskmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl {

    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectDetailsService projectDetailsService;

    public Project addProject(Project project){
        return projectService.save(project);
    }

    public Project updateProject(Project project){
        return projectService.save(project);
    }

    public Optional<Project> getProjectById(Long id){
        return  projectService.findById(id);
    }


    public List<ProjectDetails> findProjectDetailsByProjectId(Optional<Project> project){
        return projectDetailsService.findProjectDetailsByProjectId(project);
    }

}
