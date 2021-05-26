package com.example.rest2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest2.dao.UserinfoDAO;
import com.example.rest2.dto.Article;
import com.example.rest2.dto.Userinfo;
import com.example.rest2.service.UserinfoService;

@Service
public class UserinfoServiceImpl implements UserinfoService{
	
	@Autowired
	private UserinfoDAO dao;
	
	@Override
	public List<Userinfo> getAlluserinfo() {
		return dao.getAlluserinfo();
	}
	
	@Override
	public Userinfo getUser(String userid) {
		return dao.getUser(userid);
	}
	
	@Override
	public void insertUser(Userinfo userinfo) {
		dao.insertUser(userinfo);
	}
	
	@Override
	public Userinfo updateUser(String userid, Userinfo userinfo) {
		Userinfo updateUser = new Userinfo();
		
		updateUser.setUserid(userid);
		updateUser.setPw(userinfo.getPw());
		updateUser.setUsername(userinfo.getUsername());
		updateUser.setUsertype(userinfo.getUsertype());

		//return dao.updateUser(userid, userinfo);
		return updateUser;
	}
	
	@Override
	public void deleteUser(String userid) {
		dao.deleteUser(userid);
	}
	
	@Override
	public List<Article> getAllarticle() {
		return dao.getAllarticle();
	}
}
