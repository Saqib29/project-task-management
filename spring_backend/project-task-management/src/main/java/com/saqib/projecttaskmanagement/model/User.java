package com.saqib.projecttaskmanagement.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "designation")
    private String designation;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference(value = "user")
    private Set<ProjectIntegrate> projectIntegrates;

    public User() {
    }

    public User(Long id, String name, String username, String designation, String email, String password, String status, Set<ProjectIntegrate> projectIntegrates) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.designation = designation;
        this.email = email;
        this.password = password;
        this.status = status;
        this.projectIntegrates = projectIntegrates;
    }

    public Set<ProjectIntegrate> getProjectIntegrates() {
        return projectIntegrates;
    }

    public void setProjectIntegrates(Set<ProjectIntegrate> projectIntegrates) {
        this.projectIntegrates = projectIntegrates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
