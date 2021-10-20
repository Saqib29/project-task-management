package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.repository.ProjectRepository;
import com.saqib.projecttaskmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

}
