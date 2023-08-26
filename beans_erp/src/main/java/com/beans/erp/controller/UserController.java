package com.beans.erp.controller;

import com.beans.erp.model.User;
import com.beans.erp.repository.UserRepository;
import com.beans.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        User existingUser = userService.findByEmail(email);
        if (existingUser != null) {
            // Handle the case when user with this email already exists
            return "redirect:/register?error=email";
        }

        User user = new User(username, password, email);
        userRepository.save(user);
        return "redirect:/login";
    }

    @Autowired
    private UserRepository userRepository;
}
