package com.jason.lee.web.repository;

import com.jason.lee.web.entity.Type;
import com.jason.lee.web.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author huanli9
 * @description
 * @date 2020/12/7 13:46
 */
public interface TypeRepository extends JpaRepository<Type, Long> {

    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
