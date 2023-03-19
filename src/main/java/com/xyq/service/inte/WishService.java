package com.xyq.service.inte;

import com.xyq.pojo.Wish;

import java.util.List;


public interface WishService {

    List<Wish> getWishList();

    Wish getWishById(int id);

}
