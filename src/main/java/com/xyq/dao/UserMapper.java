package com.xyq.dao;

import com.xyq.pojo.Book;
import com.xyq.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 江涛
 * @create 2022/12/25 13:50
 */
@Repository
@Mapper
public interface UserMapper {

    List<User> getUsers();

    User getUserById(int id);

    List<User> selectAccuracyUser(@Param("username") String username, @Param("name") String name, @Param("dept_id") Integer dept_id, @Param("major_id") Integer major_id);

    List<User> likeSelectUser(@Param("username") String username, @Param("name") String name, @Param("dept_id") Integer dept_id, @Param("major_id") Integer major_id);

}
