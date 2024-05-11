package com.blackcode.codenestapi.service;

import com.blackcode.codenestapi.model.User;
import com.blackcode.codenestapi.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepo userRepo;

    public User create(User u) {
        User user = userRepo.findByEmail(u.getEmail());
        if (user != null && user.getPassword().equals(u.getPassword())) {
            return user;
        }else {
            return null;
        }
    }
}
