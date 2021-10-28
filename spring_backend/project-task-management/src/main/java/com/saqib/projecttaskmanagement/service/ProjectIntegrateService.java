package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.Project;
import com.saqib.projecttaskmanagement.model.ProjectIntegrate;
import com.saqib.projecttaskmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectIntegrateService extends JpaRepository<ProjectIntegrate, Long> {

    @Query("Select i from ProjectIntegrate i where i.project = ?1")
    List<ProjectIntegrate> findByProject(Project project1);

    @Query("Select u from ProjectIntegrate u where u.user.id = ?1")
    List<ProjectIntegrate> findByUser(Long id);
}
