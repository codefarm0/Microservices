package com.gl.springDataDemo.service;

import com.gl.springDataDemo.dto.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findUserByName(Long id);

    void addUser(User user);

    void deleteUserById(Long id);

    List<User> getAllUserByFirstName(String firstName);

    List<User> getUsersByGender(String gender1);

    void updateAddress(Long id, String newAdress);

}
