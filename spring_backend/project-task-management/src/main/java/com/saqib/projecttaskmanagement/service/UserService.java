package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserService extends UserRepository {
    User findByEmail(String email);
    User updateUser(User user);
}
