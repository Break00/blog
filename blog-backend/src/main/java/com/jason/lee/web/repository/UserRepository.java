package com.jason.lee.web.repository;

import com.jason.lee.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huanli9
 * @description
 * @date 2020/12/7 13:46
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsernameAndPassword(String username, String password);
}
