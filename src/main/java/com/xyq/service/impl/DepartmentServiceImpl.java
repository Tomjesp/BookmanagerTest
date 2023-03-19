package com.xyq.service.impl;

import com.xyq.dao.DepartmentMapper;
import com.xyq.pojo.Department;
import com.xyq.service.inte.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartList() {
        return departmentMapper.getDepartList();
    }

    @Override
    public Department getDepartById(int id) {
        return departmentMapper.getDepartById(id);
    }

    @Override
    public void addDepart(String name) {
        departmentMapper.addDepart(name);
        return;
    }

    @Override
    public void delDepart(int id) {
        departmentMapper.delDepart(id);
        return;
    }

    @Override
    public void updateDepart(Department department) {
        departmentMapper.updateDepart(department);
        return;
    }

}
