package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping("/all_users")
    public String getAllUsers(){
        return "get all users";
    }
}
