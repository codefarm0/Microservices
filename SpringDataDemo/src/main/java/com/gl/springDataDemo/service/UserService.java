package com.gl.springDataDemo.service;

import com.gl.springDataDemo.dto.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findUserByName(Long id);

    void addUser(User user);

    void deleteUserById(Long id);

    List<User> getAllUserByFirstName(String firstName);

    List<User> getUsersByGender(String gender1);

    void updateAddress(Long id, String newAdress);

    List<User> findSortedUsers(String paramForSorting);

    List<User> getUsersByGenderAndSort(String gender1, String sortingParam);

    Page<User>  getAllUsersByPages(int pageNumber, int numberOfElementsPerPage);
}
