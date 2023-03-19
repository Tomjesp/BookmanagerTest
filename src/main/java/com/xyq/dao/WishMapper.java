package com.xyq.dao;

import com.xyq.pojo.Wish;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/26 15:04
 */
@Repository
@Mapper
public interface WishMapper {

    List<Wish> getWishList();

    Wish getWishById(int id);

}
