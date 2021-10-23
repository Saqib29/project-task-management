package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.formclasses.ReturnMessage;
import com.saqib.projecttaskmanagement.model.ProjectDetails;
import com.saqib.projecttaskmanagement.service.ProjectDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDetailsServiceImpl {

    @Autowired
    private ProjectDetailsService projectDetailsService;

    public List<ProjectDetails> saveProjectDetails(List<ProjectDetails> projectDetailsList){

        return projectDetailsService.saveAll(projectDetailsList);
//        return new ReturnMessage("200", "Details saved successfully");
    }
}
