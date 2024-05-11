package com.blackcode.codenestapi.controller;

import com.blackcode.codenestapi.model.User;
import com.blackcode.codenestapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/users")
    public User create(@RequestBody User user){
        return userService.create(user);

    }
}
