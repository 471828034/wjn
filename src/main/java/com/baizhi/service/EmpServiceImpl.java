package com.baizhi.service;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao empDao;
    @Override
    public void insert(Emp emp) {
        empDao.insert(emp);
    }

    @Override
    public void delete(String id) {
        empDao.delete(id);
    }

    @Override
    public void update(Emp emp) {
        empDao.update(emp);
    }

    @Override
    public List<Emp> selectAll() {
        return empDao.selectAll();
    }

    @Override
    public Emp selectById(String id) {
        return empDao.selectById(id);
    }
}
