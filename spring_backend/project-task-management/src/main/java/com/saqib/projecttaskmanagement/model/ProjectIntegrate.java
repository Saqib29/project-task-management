package com.saqib.projecttaskmanagement.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "project_integrate")
public class ProjectIntegrate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="project_id", nullable=false)
    @JsonBackReference(value = "project")
    private Project project;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="user_id", nullable=false)
    @JsonBackReference(value = "user")
    private User user;

    public Long getId() {
        return id;
    }

    public ProjectIntegrate() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProjectIntegrate(Long id, Project project, User user) {
        this.id = id;
        this.project = project;
        this.user = user;
    }

    @Override
    public String toString() {
        return "ProjectIntegrate{" +
                "id=" + id +
                ", project=" + project +
                ", user=" + user +
                '}';
    }
}
