package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends UserRepository {
    public User findByEmail(String email);
}
