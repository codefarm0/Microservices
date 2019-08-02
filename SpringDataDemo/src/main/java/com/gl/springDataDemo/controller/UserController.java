package com.gl.springDataDemo.controller;

import com.gl.springDataDemo.dto.User;
import com.gl.springDataDemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable Long id, @RequestParam String address){
        return userService.updateUser(id, address);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUserById(new Long(id));
        return "User with Id " + id + " deleted";
    }

    @GetMapping("/userByName/{firstName}")
    public User findUserByName(@PathVariable String firstName){
        return userService.findUserByName(firstName);
    }


}
