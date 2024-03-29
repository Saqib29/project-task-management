package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.formclasses.GetDevelopers;
import com.saqib.projecttaskmanagement.formclasses.GetProjects;
import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectIntegrate;
import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.UserService;
import com.saqib.projecttaskmanagement.service.service_implementation.ProjectIntegrateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/integrate")
public class ProjectIntegrateController {

    @Autowired
    private ProjectIntegrateServiceImpl projectIntegrateServiceImpl;
    @Autowired
    private UserService userService;

    @GetMapping("/all_users")
    public List<User> users(){
        return userService.findAll();
    }

    @PostMapping("/integrate_to_project")
    private List<ProjectIntegrate> addUsersToProject(@RequestBody List<ProjectIntegrate> projectIntegrateList){
        return projectIntegrateServiceImpl.addUsersToProject(projectIntegrateList);
    }

    @PostMapping(value = "/developers")
    private List<GetDevelopers> getUsersOfProject(@RequestBody Project project){
        return projectIntegrateServiceImpl.getDevelopers(project);
    }

    @PostMapping("/projbydev/{id}")
    private List<GetProjects> getProjectsByDev(@PathVariable("id") Long id){
        return projectIntegrateServiceImpl.projectByDev(id);
    }

    @PostMapping("/recentProjects/{id}")
    private List<Project> recentProjects(@PathVariable("id") Long id){
        return projectIntegrateServiceImpl.recentrojects(id);
    }
}
