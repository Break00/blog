package com.jason.lee.web.service;

import com.jason.lee.web.entity.Comment;

import java.util.List;

/**
 * @author huanli9
 * @description
 * @date 2020/12/9 19:08
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
