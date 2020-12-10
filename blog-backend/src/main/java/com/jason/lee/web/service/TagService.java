package com.jason.lee.web.service;

import com.jason.lee.web.entity.Tag;
import com.jason.lee.web.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author huanli9
 * @description
 * @date 2020/12/7 15:14
 */
public interface TagService {

    Tag saveTag(Tag tag);

    void deleteTag(Long id);

    Tag updateTag(Long id, Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);

}
