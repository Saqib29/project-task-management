package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectDetails;
import com.saqib.projecttaskmanagement.repository.ProjectRepository;

import java.util.List;

public interface ProjectService extends ProjectRepository {
    Project addProject(Project project);
    Project updateProject(Project project);

}
