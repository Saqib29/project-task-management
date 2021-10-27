package com.saqib.projecttaskmanagement.formclasses;

public class GetDevelopers {
    private Long id;
    private String name;
    private String email;
    private String username;
    private String designation;

    public GetDevelopers() {
    }

    public GetDevelopers(Long id, String name, String email, String username, String designation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.designation = designation;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
