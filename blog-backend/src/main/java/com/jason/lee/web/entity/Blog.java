package com.jason.lee.web.entity;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author huanli9
 * @description 博客实体
 * @date 2020/12/7 10:26
 */
@Data
@Entity   // JPA
@Table(name = "t_blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 标题
    private String title;

    // 博客内容
    @Basic(fetch = FetchType.LAZY) // 懒加载
    @Lob  // 大字段类型
    private String content;

    // 首图
    private String firstPicture;

    // 标记 （原创/转载/翻译）
    private String flag;

    // 浏览次数
    private Integer views;

    // 赞赏开启
    private boolean appreciation;

    // 转载开启
    private boolean shareStatement;

    // 评论开启
    private boolean commentabled;

    // 是否发布
    private boolean published;

    // 是否推荐
    private boolean recommend;

    // 创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    // 更新时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    // 博客描述
    private String description;

    // 博客作者
    @ManyToOne
    private User user;

    // 博客分类
    @ManyToOne
    private Type type;

    @Transient
    private String tagIds;

    // 多对多关系维护方
    @ManyToMany
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

    public void init() {
        if (!CollectionUtils.isEmpty(tags)) {
            StringBuilder sb = new StringBuilder();
            for (Tag t : tags) {
                if (sb.length() > 0) { //防止第一位及最后一位拼接逗号！
                    sb.append(",");
                }
                sb.append(t.getId());
            }
            tagIds = sb.toString();
        }
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", views=" + views +
                ", appreciation=" + appreciation +
                ", shareStatement=" + shareStatement +
                ", commentabled=" + commentabled +
                ", published=" + published +
                ", recommend=" + recommend +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", description=" + description +
                ", user=" + user +
                ", type=" + type + '\'' +
                '}';
    }
}
