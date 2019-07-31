package com.gl.springDataDemo.service;

import com.gl.springDataDemo.dto.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findUserByName(Long id);

    void addUser(User user);

    String updateUser(Long id, String address);

    void deleteUserById(Long id);

    User findUserByName(String firstName);
}
