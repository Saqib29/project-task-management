package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.model.ProjectDetails;
import com.saqib.projecttaskmanagement.service.ProjectDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/projectDetails")
public class ProjectDetailsController {

    @Autowired
    private ProjectDetailsService projectDetailsService;

    @GetMapping
    public String getProjectTask(){
        return "project Task";
    }

    @PostMapping("/add_details")
    public List<ProjectDetails> addProjectDetails(@RequestBody List<ProjectDetails> projectDetails){
        List<ProjectDetails> saveDetails = projectDetailsService.saveProjectDetails(projectDetails);
        return saveDetails;
    }
}
