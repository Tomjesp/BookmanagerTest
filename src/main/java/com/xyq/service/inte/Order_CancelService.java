package com.xyq.service.inte;

import com.xyq.pojo.Order_Cancel;

import java.util.List;


public interface Order_CancelService {

    List<Order_Cancel> getOrder_CancelList();

    Order_Cancel getOrder_CancelById(int id);

    List<Order_Cancel> accuracyGetOrder_Cancel(String bookname, String username, Integer state);

    List<Order_Cancel> likeGetOrder_Cancel(String bookname, String username, Integer state);


}
