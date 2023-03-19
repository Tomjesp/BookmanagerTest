package com.xyq.service.inte;

import com.xyq.pojo.Major;

import java.util.List;


public interface MajorService {

    List<Major> getMajorList();

    Major getMajorById(Integer id);

    void addMajor(Major major);

    void delMajor(int id);

    void updMajor(Major major);

}
