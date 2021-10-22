package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/register")
public class RegistrationController {

    public String register(@RequestBody User user){
        return "registered";
    }
}
