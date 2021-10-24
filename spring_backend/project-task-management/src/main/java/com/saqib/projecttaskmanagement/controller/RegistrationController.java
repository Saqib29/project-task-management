package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/register")
public class RegistrationController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return registerService.registerUser(user);
    }

}
