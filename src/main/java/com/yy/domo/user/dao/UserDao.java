package com.yy.domo.user.dao;

import com.yy.domo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<User> getAll(@Param("content") Map map);
    Integer delById(Integer id);
    void save(User user);

}
