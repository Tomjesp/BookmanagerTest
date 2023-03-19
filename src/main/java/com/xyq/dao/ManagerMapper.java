package com.xyq.dao;

import com.xyq.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/23 13:50
 */
@Repository
@Mapper
public interface ManagerMapper {

    Manager getManagerByUsername(String username);

}
