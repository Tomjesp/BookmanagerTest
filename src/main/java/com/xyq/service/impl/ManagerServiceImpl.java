package com.xyq.service.impl;

import com.xyq.dao.ManagerMapper;
import com.xyq.pojo.Manager;
import com.xyq.service.inte.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager getManagerByUsername(String username) {
        return managerMapper.getManagerByUsername(username);
    }
}
