package com.saqib.projecttaskmanagement.formclasses;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectDetails;

import java.util.List;
import java.util.Optional;

public class SingleProjectView {
    private Optional<Project> project;
    private List<ProjectDetails> projectDetailsList;

    public SingleProjectView() {
    }

    public Optional<Project> getProject() {
        return project;
    }

    public void setProject(Optional<Project> project) {
        this.project = project;
    }

    public List<ProjectDetails> getProjectDetailsList() {
        return projectDetailsList;
    }

    public void setProjectDetailsList(List<ProjectDetails> projectDetailsList) {
        this.projectDetailsList = projectDetailsList;
    }
}
