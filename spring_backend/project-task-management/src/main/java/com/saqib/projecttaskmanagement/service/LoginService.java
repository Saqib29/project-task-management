package com.saqib.projecttaskmanagement.service;

import com.saqib.projecttaskmanagement.model.User;
import com.saqib.projecttaskmanagement.repository.LoginRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public interface LoginService extends LoginRepository {

    @Query("Select u from User u where u.email = :email and u.password = :password")
    User findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
