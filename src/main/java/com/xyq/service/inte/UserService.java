package com.xyq.service.inte;


import com.xyq.pojo.User;
import com.xyq.pojo.UserExcelData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



public interface UserService {

    List<User> getUsers();

    User getUserById(int id);

    List<User> accuracyQueryUser(String username, String name, Integer dept_id, Integer major_id);

    List<User> likeQueryUser(String username, String name, Integer dept_id, Integer major_id);

}
