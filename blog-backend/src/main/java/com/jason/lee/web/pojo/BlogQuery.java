package com.jason.lee.web.pojo;

import lombok.Data;

/**
 * @author huanli9
 * @description
 * @date 2020/12/7 17:33
 */
@Data
public class BlogQuery {

    private String title;
    private Long typeId;
    private boolean recommend;
}

