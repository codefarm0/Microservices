package com.gl.springDataDemo.controller;

import com.gl.springDataDemo.dto.User;
import com.gl.springDataDemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger("UserManagementApp");

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        logger.info("getting users..");
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id){
        return userService.findUserByName(new Long(id));
    }

    @PostMapping("/user")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        userService.addUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        return ResponseEntity.created(path).build();

    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUserById(new Long(id));
        return "User with Id " + id + " deleted";
    }

    @GetMapping("/getAllUserByFirstName/{firstName}")
    public List<User>getAllUsersByFirstName(@PathVariable String firstName){
        return userService.getAllUserByFirstName(firstName);
    }

    @GetMapping("/getAllUserByGender/{gender}")
    public List<User>getAllUsersByGender(@PathVariable String gender){
        return userService.getUsersByGender(gender);
    }

    @PutMapping("/updateAddress/{id}/{newAddress}")
    public String updateAddress(@PathVariable String id, @PathVariable String newAddress){
        userService.updateAddress(Long.parseLong(id), newAddress);
        return "address updated!!";
    }

    @GetMapping("/getAllSortedUser/{sortedParam}")
    public List<User>getAllSortedusers(@PathVariable String sortedParam){
        return userService.findSortedUsers(sortedParam);
    }

    @GetMapping("/getAllUserByGender/{gender}/{sortedParam}")
    public List<User>getAllUsersByGenderAndSort(@PathVariable String gender, @PathVariable String sortedParam){
        return userService.getUsersByGenderAndSort(gender, sortedParam);
    }

    @GetMapping("/getAllUserByPages/{pageNumber}/{numberOfElementsPerPage}")
    public Page<User> getAllUserByPages(@PathVariable String pageNumber, @PathVariable String numberOfElementsPerPage){
        return userService.getAllUsersByPages(Integer.parseInt(pageNumber), Integer.parseInt(numberOfElementsPerPage));
    }
}
