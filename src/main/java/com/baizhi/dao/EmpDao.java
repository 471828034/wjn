package com.baizhi.dao;

import com.baizhi.entity.Emp;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface EmpDao {
    //增
    public void insert(Emp emp);
    //删除
    public  void delete (String id);
    //修改
    public  void update (Emp emp);
    //查询所有
    public List<Emp> selectAll();
    //根据id查询
    public Emp selectById(String id);



}
