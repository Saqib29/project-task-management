package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterService extends JpaRepository<User, Long> {
    public User registerUser(User user);
    public User findByEmail(String email);
}
