package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.formclasses.Login;
import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.LoginService;
import com.saqib.projecttaskmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    private User login(@RequestBody Login login){
        User user = loginService.findByEmailAndPassword(login.getEmail(), login.getPassword());
        return user;
    }

}
