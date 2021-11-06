package com.saqib.projecttaskmanagement.formclasses;

import com.saqib.projecttaskmanagement.model.User;

public class ReturnRegisteredUser {
    private User user;
    private boolean status;

    public ReturnRegisteredUser(User user, boolean status) {
        this.user = user;
        this.status = status;
    }

    public ReturnRegisteredUser() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
