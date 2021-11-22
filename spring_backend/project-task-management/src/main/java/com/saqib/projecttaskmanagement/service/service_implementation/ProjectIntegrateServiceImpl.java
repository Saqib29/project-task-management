package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.formclasses.GetDevelopers;
import com.saqib.projecttaskmanagement.formclasses.GetProjects;
import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectIntegrate;
import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.ProjectIntegrateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
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

    public List<GetProjects> projectByDev(Long id){
        List<GetProjects> getProjectsList = new ArrayList<>();
        List<ProjectIntegrate> projectIntegrateList = projectIntegrateService.findByUser(id);
        for (ProjectIntegrate pro: projectIntegrateList) {
            GetProjects getProjects = new GetProjects();
            getProjects.setProjectName(pro.getProject().getProjectName());
            getProjects.setId(pro.getProject().getId());
            getProjects.setProjectPercentage(pro.getProject().getProjectPercentage());
            getProjects.setCreatedDate(pro.getProject().getProjectCreateDate());
            getProjects.setDeadline(pro.getProject().getProjectDeadline());

            getProjectsList.add(getProjects);
        }

        return getProjectsList;
    }

    public List<Project> recentrojects(Long id){

        List<ProjectIntegrate> projects = projectIntegrateService.recentProjects(id, new Date());
        List<Project> recentProject = new ArrayList<>();
        for (ProjectIntegrate projectIntegrate : projects) {
            recentProject.add(projectIntegrate.getProject());
        }

        return recentProject;
    }
}
