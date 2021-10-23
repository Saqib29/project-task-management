package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.repository.ProjectRepository;

public interface ProjectService extends ProjectRepository {
    Project addProject(Project project);
    Project updateProject(Project project);
}
