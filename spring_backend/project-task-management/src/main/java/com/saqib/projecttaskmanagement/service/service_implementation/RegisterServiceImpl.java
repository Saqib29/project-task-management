package com.saqib.projecttaskmanagement.service.service_implementation;

import com.saqib.projecttaskmanagement.repository.UserRepository;
import com.saqib.projecttaskmanagement.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserRepository userRepository;
}
