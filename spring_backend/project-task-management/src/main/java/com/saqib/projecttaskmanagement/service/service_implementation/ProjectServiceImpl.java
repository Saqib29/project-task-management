package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.repository.ProjectRepository;
import com.saqib.projecttaskmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl  {

    @Autowired
    private ProjectService projectService;

    public Project addProject(Project project){
        return projectService.save(project);
    }

}
