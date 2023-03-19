package com.xyq.service.inte;

import com.xyq.pojo.Book;
import com.xyq.pojo.Order;

import java.util.List;
import java.util.Map;


public interface OrderService {
    List<Order> getOrders();

    Order getOrderById(int id);

    //精准查询订单
    List<Order> accuracyQueryBooks(Integer oid, String username, Integer stautus);

    //模糊查询订单
    List<Order> likeQueryBooks(Integer oid, String username, Integer stautus);

    //根据id查询订单状态（状态表）
    String findStateById(Integer id);
}
