package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.formclasses.GetDevelopers;
import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectIntegrate;
import com.saqib.projecttaskmanagement.service.ProjectIntegrateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectIntegrateServiceImpl {

    @Autowired
    private ProjectIntegrateService projectIntegrateService;

    public List<ProjectIntegrate> addUsersToProject(List<ProjectIntegrate> projectIntegrateList){
        return projectIntegrateService.saveAll(projectIntegrateList);
    }

    public List<GetDevelopers> getDevelopers(Project project){
        List<ProjectIntegrate> projectIntegrates = projectIntegrateService.findByProject(project);
        List<GetDevelopers> getDevelopers = new ArrayList<>();
        for (ProjectIntegrate pro: projectIntegrates) {
            GetDevelopers dev = new GetDevelopers();
            dev.setId(pro.getUser().getId());
            dev.setName(pro.getUser().getName());
            dev.setUsername(pro.getUser().getUsername());
            dev.setEmail(pro.getUser().getEmail());
            dev.setDesignation(pro.getUser().getDesignation());

            getDevelopers.add(dev);
        }
        return getDevelopers;
    }
}
