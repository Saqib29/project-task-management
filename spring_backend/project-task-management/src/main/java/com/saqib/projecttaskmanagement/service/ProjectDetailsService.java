package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.ProjectDetails;
import com.saqib.projecttaskmanagement.repository.ProjectDetailsRepository;
import com.saqib.projecttaskmanagement.repository.ProjectRepository;

import java.util.List;

public interface ProjectDetailsService extends ProjectDetailsRepository {

    List<ProjectDetails> saveProjectDetails(List<ProjectDetails> projectDetailsList);
}
