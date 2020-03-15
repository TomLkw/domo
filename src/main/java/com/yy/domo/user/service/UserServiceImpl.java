package com.yy.domo.user.service;

import com.yy.domo.user.dao.UserDao;
import com.yy.domo.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public Integer delById(Integer id) {

        userDao.delById(id);
        return null;
    }

    @Override
    public void save(User user) {
        user.setCreatetime(new Date());
        user.setStatus(1);
        System.out.println("lll"+user);
        userDao.save(user);
    }
}
