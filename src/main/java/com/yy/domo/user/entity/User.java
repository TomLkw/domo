package com.yy.domo.user.entity;
import java.util.Date;
public class User {
    private Integer id;
    private String username;
    private String password;
    private Date createtime;
    private Integer status;

    public User(Integer id, String username, String password, Date createtime, Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.status = status;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                ", status=" + status +
                '}';
    }
}
