package com.xyq.dao;

import com.xyq.pojo.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/23 10:30
 */
@Repository
@Mapper
public interface MajorMapper {

    List<Major> getMajorList();

    Major getMajorById(@Param("id") Integer id);

    void addMajor(Major major);

    void delMajor(int id);

    void updMajor(Major major);

}
