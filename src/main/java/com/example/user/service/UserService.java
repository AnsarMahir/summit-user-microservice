package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(String username,boolean isConfirmed) {
        User user = new User(username, isConfirmed);
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String subId) {
        return userRepository.findBySubId(subId);
    }
}
