package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.service.ProjectDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService {

    @Autowired
    private ProjectDetailsService projectDetailsService;
}
