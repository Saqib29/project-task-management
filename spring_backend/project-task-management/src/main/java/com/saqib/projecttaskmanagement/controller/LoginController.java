package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.formclasses.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    private String login(@RequestBody Login login){
        return login.getEmail() + " " + login.getPassword();
    }

}
