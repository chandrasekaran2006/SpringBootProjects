package com.the.basic.tech.info.service;

import java.util.List;

import com.the.basic.tech.info.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
