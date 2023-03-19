package com.xyq.service.impl;

import com.xyq.dao.WishMapper;
import com.xyq.pojo.Wish;
import com.xyq.service.inte.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WishServiceImpl implements WishService {

    @Autowired
    private WishMapper wishMapper;


    @Override
    public List<Wish> getWishList() {
        return wishMapper.getWishList();
    }

    @Override
    public Wish getWishById(int id) {
        return wishMapper.getWishById(id);
    }
}
