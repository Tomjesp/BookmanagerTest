package com.xyq.service.impl;

import com.xyq.dao.UserMapper;
import com.xyq.pojo.UserExcelData;
import com.xyq.pojo.User;
import com.xyq.service.inte.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> accuracyQueryUser(String username, String name, Integer dept_id, Integer major_id) {
        return userMapper.selectAccuracyUser(username, name, dept_id, major_id);
    }

    @Override
    public List<User> likeQueryUser(String username, String name, Integer dept_id, Integer major_id) {
        return userMapper.likeSelectUser(username, name, dept_id, major_id);
    }

}
