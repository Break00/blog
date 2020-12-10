package com.jason.lee.web.dialect;

import org.hibernate.dialect.MySQL5Dialect;

/**
 * @author huanli9
 * @description  解决数据库字段编码问题
 * @date 2020/12/8 11:06
 */
public class MyDialect extends MySQL5Dialect {
    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
