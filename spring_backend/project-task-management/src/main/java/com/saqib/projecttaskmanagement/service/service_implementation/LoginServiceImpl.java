package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl {

    @Autowired
    private LoginService loginService;

    public User findByEmailAndPassword(String email, String password){
        return loginService.findByEmailAndPassword(email, password);
    }
}
