package com.saqib.projecttaskmanagement.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_summery")
    private String projectSummery;

    @Column(name = "project_percentage")
    private int projectPercentage;

    @Column(name = "project_create_date")
    private Date projectCreateDate;

    @Column(name = "project_deadline")
    private Date projectDeadline;

    @OneToMany(mappedBy="project")
    private Set<ProjectDetails> projectDetailsSet;

    public Project(Long id, String projectName, String projectSummery, int projectPercentage, Date projectCreateDate, Date projectDeadline, Set<ProjectDetails> projectDetailsSet) {
        this.id = id;
        this.projectName = projectName;
        this.projectSummery = projectSummery;
        this.projectPercentage = projectPercentage;
        this.projectCreateDate = projectCreateDate;
        this.projectDeadline = projectDeadline;
        this.projectDetailsSet = projectDetailsSet;
    }

    public Set<ProjectDetails> getProjectDetailsSet() {
        return projectDetailsSet;
    }

    public void setProjectDetailsSet(Set<ProjectDetails> projectDetailsSet) {
        this.projectDetailsSet = projectDetailsSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectSummery() {
        return projectSummery;
    }

    public void setProjectSummery(String projectSummery) {
        this.projectSummery = projectSummery;
    }

    public int getProjectPercentage() {
        return projectPercentage;
    }

    public void setProjectPercentage(int projectPercentage) {
        this.projectPercentage = projectPercentage;
    }

    public Date getProjectCreateDate() {
        return projectCreateDate;
    }

    public void setProjectCreateDate(Date projectCreateDate) {
        this.projectCreateDate = projectCreateDate;
    }

    public Date getProjectDeadline() {
        return projectDeadline;
    }

    public void setProjectDeadline(Date projectDeadline) {
        this.projectDeadline = projectDeadline;
    }
}
