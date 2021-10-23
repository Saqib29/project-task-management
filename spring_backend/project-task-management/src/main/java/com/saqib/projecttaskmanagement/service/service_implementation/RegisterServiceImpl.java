package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.repository.UserRepository;
import com.saqib.projecttaskmanagement.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl {

    @Autowired
    private RegisterService registerService;

    public User registerUser(User user){
        User checkUser = registerService.findByEmail(user.getEmail());
        if (checkUser == null){
            User registerUser = registerService.save(user);
            return registerUser;
        }
        return null;
    }
}
