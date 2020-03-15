package com.yy.domo.user.service;

import com.yy.domo.user.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getAll(Map map);
    Integer delById(Integer id);
    void save(User user);

}
