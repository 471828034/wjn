package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    public Admin selectByUsernameAndPassword(@Param("username")String username ,@Param("password")String password);

}
