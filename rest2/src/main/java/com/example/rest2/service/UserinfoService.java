package com.example.rest2.service;

import com.example.rest2.dto.Userinfo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserinfoService {
	List<Userinfo> getAlluserinfo();
	Userinfo getUser(String userid);
	void insertUser(Userinfo userinfo);
	Userinfo updateUser(String userid, Userinfo userinfo);
	void deleteUser(String userid);
}
