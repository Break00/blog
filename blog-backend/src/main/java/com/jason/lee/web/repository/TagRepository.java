package com.jason.lee.web.repository;

import com.jason.lee.web.entity.Tag;
import com.jason.lee.web.entity.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author huanli9
 * @description
 * @date 2020/12/7 13:46
 */
public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
//    @Query("SELECT t.id tid,t.NAME,b.id bid,b.title FROM t_tag t,t_blog b,t_blog_tags bt WHEREt.id = bt.tags_id AND b.id = bt.blogs_id")
}
