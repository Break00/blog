package com.jason.lee.web.service;

import com.jason.lee.web.entity.User;

/**
 * @author huanli9
 * @description
 * @date 2020/12/7 13:44
 */
public interface UserService {
    User checkUser(String username, String password);
}
