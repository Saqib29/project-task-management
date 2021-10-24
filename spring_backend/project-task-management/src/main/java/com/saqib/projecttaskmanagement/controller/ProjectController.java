package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.formclasses.SingleProjectView;
import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectDetails;
import com.saqib.projecttaskmanagement.service.ProjectDetailsService;
import com.saqib.projecttaskmanagement.service.ProjectService;
import com.saqib.projecttaskmanagement.service.service_implementation.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectServiceImpl projectServiceImpl;
    @Autowired
    private ProjectDetailsService projectDetailsService;

    @GetMapping("/all_projects")
    public String getAllProjects(){
        return "All projects";
    }

    @PostMapping("/add_project")
    public Project addProject(@RequestBody Project project){
        Project addProject = projectService.addProject(project);
        return addProject;
    }

    @PostMapping("/update")
    public Project updateProject(@RequestBody Project project){
        return projectService.updateProject(project);
    }

    @PostMapping("/{id}")
    public Optional<Project> getById(@PathVariable("id") Long id){
        return projectServiceImpl.getProjectById(id);
    }

    @PostMapping("/getProjectDetails/{id}")
    public List<ProjectDetails> getProjectById(@PathVariable Long id){
//        have to search project by id
//        have to search projectDetails where project equal to project id

        Optional<Project> project = projectServiceImpl.getProjectById(id);
        return projectDetailsService.findByProject(project);
//        return projectDetailsService.findProjectDetailsByProjectId(project);

//        return new SingleProjectView();
    }
}
