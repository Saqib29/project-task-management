package com.saqib.projecttaskmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projectDetails")
public class ProjectDetailsController {

    @GetMapping
    public String getProjectTask(){
        return "project Task";
    }
}
