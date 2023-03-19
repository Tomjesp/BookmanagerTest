package com.xyq.service.impl;

import com.xyq.dao.MajorMapper;
import com.xyq.pojo.Major;
import com.xyq.service.inte.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;


    @Override
    public List<Major> getMajorList() {
        return majorMapper.getMajorList();
    }

    @Override
    public Major getMajorById(Integer id) {
        return majorMapper.getMajorById(id);
    }

    @Override
    public void addMajor(Major major) {
        majorMapper.addMajor(major);
    }

    @Override
    public void delMajor(int id) {
        majorMapper.delMajor(id);
    }

    @Override
    public void updMajor(Major major) {
        majorMapper.updMajor(major);
    }
}
