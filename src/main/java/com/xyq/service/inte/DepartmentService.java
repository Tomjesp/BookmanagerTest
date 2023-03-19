package com.xyq.service.inte;

import com.xyq.pojo.Department;

import java.util.List;


public interface DepartmentService {

    List<Department> getDepartList();

    Department getDepartById(int id);

    void addDepart(String name);

    void delDepart(int id);

    void updateDepart(Department department);


}
