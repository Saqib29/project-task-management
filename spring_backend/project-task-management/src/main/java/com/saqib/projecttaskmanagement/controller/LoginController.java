package com.saqib.projecttaskmanagement.controller;

import com.saqib.projecttaskmanagement.formclasses.Login;
import com.saqib.projecttaskmanagement.formclasses.ReturnRegisteredUser;
import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @CrossOrigin
    @PostMapping
    private ReturnRegisteredUser login(@RequestBody Login login){
        ReturnRegisteredUser returnRegisteredUser = new ReturnRegisteredUser();
        User user = loginService.findByEmailAndPassword(login.getEmail(), login.getPassword());
        returnRegisteredUser.setUser(user);
        if (user == null){
            returnRegisteredUser.setStatus(false);
        }else{
            returnRegisteredUser.setStatus(true);
        }

        return returnRegisteredUser;
    }

}
