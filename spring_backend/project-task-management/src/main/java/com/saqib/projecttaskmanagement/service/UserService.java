package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
