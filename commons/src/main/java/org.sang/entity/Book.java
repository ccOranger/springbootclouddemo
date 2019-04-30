package org.sang.entity;

/**
 * @package: org.sang.entity
 * @className: ${TYPE_NAME}
 * @description: 类作用描述
 * @author: 李臣臣
 * @createDate: 2019/4/30 14:02
 * @updateUser: 李臣臣
 * @updateDate: 2019/4/30 14:02
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2019</p>
 */
public class Book {

    private Integer id ;
    private String name ;
    private String author;
    private String createTime;

    public Book(){

    }

    public Book(Integer id, String name, String author, String createTime) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.createTime = createTime;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
