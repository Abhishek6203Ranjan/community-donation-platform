package com.user.service;

import com.user.dao.UseDao;
import com.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UseDao userDao;

    public boolean registerUser(User user) {
        return userDao.insertUser(user);
    }

    public User authenticateUser(String email, String password) {
        User user = userDao.selectUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
