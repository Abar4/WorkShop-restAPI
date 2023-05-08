package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.LoginModel;
@Repository
public interface LoginRepo extends JpaRepository<LoginModel,String>{

    LoginModel findByEmail(String email);
}