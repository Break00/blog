package com.jason.lee.web.service.impl;

import com.jason.lee.util.MD5Utils;
import com.jason.lee.web.entity.User;
import com.jason.lee.web.repository.UserRepository;
import com.jason.lee.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huanli9
 * @description
 * @date 2020/12/7 13:45
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findUserByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
