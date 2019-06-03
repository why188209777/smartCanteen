package com.dao;

import org.apache.ibatis.annotations.Param;

import com.model.Admin;

public interface AdminDao {

	public Admin login(@Param("aname") String aname, @Param("password") String password);
}
