package com.aboylan.curso.springboot.error.springbooterror.services;

import java.util.List;

import com.aboylan.curso.springboot.error.springbooterror.models.domain.User;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

}
