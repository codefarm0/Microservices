package com.gl.userManagementApp.service;

import com.gl.userManagementApp.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(String id);

    void addUser(User user);

    User updateUser(User user);

    User deleteUser(String id);

}
