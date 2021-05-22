package com.example.rest2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.rest2.dto.Userinfo;

@Repository
public interface UserinfoDAO {
	List<Userinfo> getAlluserinfo();
	Userinfo getUser(String userid);
	void insertUser(Userinfo userinfo);
	Userinfo updateUser(@Param("userid") String userid, @Param("userinfo")Userinfo userinfo);
	void deleteUser(String userid);
}
