package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.repository.ProjectRepository;
import com.saqib.projecttaskmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProjectServiceImpl  {

    @Autowired
    private ProjectService projectService;

    public Project addProject(Project project){
        return projectService.save(project);
    }

    public Project updateProject(Project project){
        return projectService.save(project);
    }

}
