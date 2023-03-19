package com.xyq.service.impl;

import com.xyq.dao.OrderMapper;
import com.xyq.pojo.Order;
import com.xyq.service.inte.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrders() {
        return orderMapper.getOrders();
    }

    @Override
    public Order getOrderById(int id) {
        return orderMapper.getOrderById(id);
    }

    @Override
    public List<Order> accuracyQueryBooks(Integer oid, String username, Integer stautus) {
        return orderMapper.selectAccuracyOrder(oid, username, stautus);
    }

    @Override
    public List<Order> likeQueryBooks(Integer oid, String username, Integer status) {
        return orderMapper.selectLikeOrder(oid, username, status);
    }

    @Override
    public String findStateById(Integer id) {
        return orderMapper.selectState(id);
    }
}
