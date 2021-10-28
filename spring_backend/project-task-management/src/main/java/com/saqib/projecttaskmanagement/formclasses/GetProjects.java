package com.saqib.projecttaskmanagement.formclasses;

import java.util.Date;

public class GetProjects {
    private Long Id;
    private String projectName;
    private int projectPercentage;
    private Date createdDate;
    private Date deadline;

    public GetProjects() {
    }

    public GetProjects(Long id, String projectName, int projectPercentage, Date createdDate, Date deadline) {
        Id = id;
        this.projectName = projectName;
        this.projectPercentage = projectPercentage;
        this.createdDate = createdDate;
        this.deadline = deadline;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectPercentage() {
        return projectPercentage;
    }

    public void setProjectPercentage(int projectPercentage) {
        this.projectPercentage = projectPercentage;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
