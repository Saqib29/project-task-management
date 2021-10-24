package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectIntegrate;
import com.saqib.projecttaskmanagement.service.ProjectIntegrateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProjectIntegrateServiceImpl {

    @Autowired
    private ProjectIntegrateService projectIntegrateService;

    public List<ProjectIntegrate> addUsersToProject(List<ProjectIntegrate> projectIntegrateList){
        return projectIntegrateService.saveAll(projectIntegrateList);
    }

    public List<ProjectIntegrate> getDevelopers(Project project){
        return projectIntegrateService.findByProject(project);
    }
}
