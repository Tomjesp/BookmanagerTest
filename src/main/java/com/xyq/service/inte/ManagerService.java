package com.xyq.service.inte;

import com.xyq.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;


public interface ManagerService {

    Manager getManagerByUsername(String username);

}
