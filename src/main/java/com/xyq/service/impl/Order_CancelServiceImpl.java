package com.xyq.service.impl;

import com.xyq.dao.Order_CancelMapper;
import com.xyq.pojo.Order_Cancel;
import com.xyq.service.inte.Order_CancelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_CancelServiceImpl implements Order_CancelService {

    @Autowired
    private Order_CancelMapper order_cancelMapper;

    @Override
    public List<Order_Cancel> getOrder_CancelList() {
        return order_cancelMapper.getOrder_CancelList();
    }

    @Override
    public Order_Cancel getOrder_CancelById(int id) {
        return order_cancelMapper.getOrder_CancelById(id);
    }

    @Override
    public List<Order_Cancel> accuracyGetOrder_Cancel(String bookname, String username, Integer state) {
        return order_cancelMapper.selectAccuracyOrder2(bookname, username, state);
    }

    @Override
    public List<Order_Cancel> likeGetOrder_Cancel(String bookname, String username, Integer state) {
        return order_cancelMapper.likeSelectOrder2(bookname, username, state);
    }
}
