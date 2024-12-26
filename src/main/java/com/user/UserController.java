package com.user.controller;

import com.user.dao.UseDao;
import com.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UseDao userDao;

    // Display login page
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // Display registration page
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registration";
    }

    // Handle registration form submission
    @PostMapping("/register")
    public String registerUser(@Validated User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registration"; // Return to registration page if validation fails
        }

        // Proceed with user registration if no errors
        if (userDao.insertUser(user)) {
            model.addAttribute("message", "Registration successful. Please login.");
            return "login"; // Redirect to login page after successful registration
        } else {
            model.addAttribute("message", "Error during registration. Try again.");
            return "registration"; // Return to registration page if error occurs
        }
    }

    // Handle login form submission
    @PostMapping("/login")
    public String loginUser(@Validated User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "login"; // Return to login page if validation fails
        }

        // Add logic to verify user credentials (login logic)
        if (userDao.verifyUser(user)) { // Change to UseDao for verification
            return "profile"; // Redirect to profile page if login is successful
        } else {
            model.addAttribute("message", "Invalid credentials.");
            return "login"; // Stay on login page if login fails
        }
    }
}
