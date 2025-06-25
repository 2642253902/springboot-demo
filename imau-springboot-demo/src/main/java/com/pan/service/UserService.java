package com.pan.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pan.dao.UserDao;
import com.pan.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserDao userDao;

    public void addUser(String password) {
        UserPojo userPojo = new UserPojo();
        userPojo.setPassword(password);
        userDao.insert(userPojo);
    }


    public void delUser(int username) {
        UserPojo userPojo = new UserPojo();
        userPojo.setUsername(username);
        userDao.deleteById(userPojo);
    }

    public void delUserByName(String password) {
        userDao.delete(new QueryWrapper<UserPojo>().like("password", password));
    }

    public void findUserByName(int username) {
        UserPojo username1 = userDao.selectOne(new QueryWrapper<UserPojo>().eq("username", username));
        System.out.println(username1);

    }

    public Object findUserByPassword(String password) {
        List<UserPojo> password1 = userDao.selectList(new QueryWrapper<UserPojo>().like("password", password));
        password1.forEach(item -> System.out.println(item));
        return password1 ;
    }

    public void updateUserByUsername(int username, String password) {
        UserPojo username1 = userDao.selectById(username);
        username1.setPassword(password);
        userDao.update(username1, new QueryWrapper<UserPojo>().eq("username", username));


    }
}