package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/all_projects")
    public String getAllProjects(){
        return "All projects";
    }

    @PostMapping("/add_project")
    public Project addProject(@RequestBody Project project){
        Project addProject = projectService.addProject(project);
        return addProject;
    }
}
