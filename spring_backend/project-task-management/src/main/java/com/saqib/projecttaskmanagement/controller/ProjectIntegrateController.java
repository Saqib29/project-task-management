package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/integrate")
public class ProjectIntegrateController {

    @Autowired
    private UserService userService;

    @GetMapping("/all_users")
    public List<User> users(){
        return userService.findAll();
    }
}
