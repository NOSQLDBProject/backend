package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.request.UserRequest;
import emi.ac.ma.mongoproject.services.UserService;
import org.springframework.web.bind.annotation.*;
import emi.ac.ma.mongoproject.entities.response.User;


@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        userService.updateUser(id, updatedUser);
    }

    @PostMapping("/login")
    public User getUser(@RequestBody UserRequest user) {
        return userService.getUser(user.getEmail(),user.getPassword());
    }


}
