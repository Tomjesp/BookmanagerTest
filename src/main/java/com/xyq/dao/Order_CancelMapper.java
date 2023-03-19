package com.xyq.dao;

import com.xyq.pojo.Order_Cancel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/23 21:56
 */
@Repository
@Mapper
public interface Order_CancelMapper {

    List<Order_Cancel> getOrder_CancelList();

    Order_Cancel getOrder_CancelById(int id);

    List<Order_Cancel> selectAccuracyOrder2(@Param("bookname") String bookname, @Param("username") String username, @Param("state") Integer state);

    List<Order_Cancel> likeSelectOrder2(@Param("bookname") String bookname, @Param("username") String username, @Param("state") Integer state);


}
