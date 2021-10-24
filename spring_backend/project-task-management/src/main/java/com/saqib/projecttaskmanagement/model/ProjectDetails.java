package com.saqib.projecttaskmanagement.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "project_details")
public class ProjectDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @JsonIgnore
//    @JsonIgnoreProperties("project")
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name="project_id", nullable=true)
    @JsonBackReference
    private Project project;

    @Column(name = "project_task")
    private String projectTask;

    @Column(name = "status")
    private String status;

    @Column(name = "added_by")
    private String addedBy;

    @Column(name = "deleted_by")
    private String deletedBy;

    @Column(name = "updated_by")
    private String updatedBy;


    public ProjectDetails(Long id, Project project, String projectTask, String status, String addedBy, String deletedBy, String updatedBy) {
        this.id = id;
        this.project = project;
        this.projectTask = projectTask;
        this.status = status;
        this.addedBy = addedBy;
        this.deletedBy = deletedBy;
        this.updatedBy = updatedBy;
    }

    public ProjectDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getProjectTask() {
        return projectTask;
    }

    public void setProjectTask(String projectTask) {
        this.projectTask = projectTask;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
