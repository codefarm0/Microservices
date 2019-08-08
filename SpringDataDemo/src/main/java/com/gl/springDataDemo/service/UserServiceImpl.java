package com.gl.springDataDemo.service;

import com.gl.springDataDemo.dto.User;
import com.gl.springDataDemo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
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
    public void deleteUserById(Long id) {
        userRepository.deleteById(new Long(id));
        logger.info("User with {} deleted from the DB", id);

    }

    @Override
    public List<User> getAllUserByFirstName(String firstName) {
        return userRepository.getAllUserByFirstName(firstName);
    }

    @Override
    public List<User> getUsersByGender(String gender1) {
        return userRepository.getUsersByGender(gender1);
    }

    @Override
    public void updateAddress(Long id, String newAdress) {
        userRepository.updateAddress(id, newAdress);
    }

    @Override
    public List<User> findSortedUsers(String paramForSorting) {
        return (List<User>) userRepository.findAll(Sort.by(paramForSorting));
    }

    @Override
    public List<User> getUsersByGenderAndSort(String gender1, String sortingParam) {

        return userRepository.getUsersByGenderAndSort(gender1, Sort.by(sortingParam));
    }

    @Override
    public Page<User> getAllUsersByPages(int pageNumber, int numberOfElementsPerPage) {
        return userRepository.findAll(PageRequest.of(pageNumber,numberOfElementsPerPage));
    }

    public Slice<User> getAllUsersBySlices(int pageNumber, int numberOfElementsPerPage) {
        Slice<User> users = userRepository.findAll(PageRequest.of(pageNumber, numberOfElementsPerPage));
        return users;
    }
}
