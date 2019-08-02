package com.gl.springDataDemo.service;

import com.gl.springDataDemo.dto.User;
import com.gl.springDataDemo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        List<User> userList = (List<User>) userRepository.findAll();
        logger.info("User list from the DB - {} ", userList);
        return userList;
    }

    @Override
    public User findUserByName(Long id) {
        User user = userRepository.findById(id).get();
        logger.info("User from the DB - {} ", user);
        return user;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
        logger.info("User added - {}", user);
    }

    @Override
    public String updateUser(Long id, String address) {
        userRepository.updateAddress(id, address);
        logger.info("New address for user_id " + id +" is - " + address);
        return "New address for user_id " + id +" is - " + address;
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(new Long(id));
        logger.info("User with {} deleted from the DB", id);

    }

    @Override
    public User findUserByName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }
}
