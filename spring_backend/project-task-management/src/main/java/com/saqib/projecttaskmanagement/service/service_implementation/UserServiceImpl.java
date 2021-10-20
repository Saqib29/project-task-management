package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.repository.UserRepository;
import com.saqib.projecttaskmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

}
