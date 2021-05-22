package com.example.rest2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest2.dto.Userinfo;
import com.example.rest2.service.UserinfoService;

@RestController
public class UserinfoController {
	
	@Autowired
	private UserinfoService service;
	
	@GetMapping(path="/userinfo")
	public List<Userinfo> getAlluserinfo() {
		return service.getAlluserinfo();
	}
	
	@GetMapping(path="/userinfo/{userid}")
	public Userinfo getUser(@PathVariable String userid) {
		return service.getUser(userid);
	}
	
	@PostMapping(path="/userinfo")
	public Userinfo insertUser(@RequestBody Userinfo userinfo) {
		service.insertUser(userinfo);
		return userinfo;
	}
	
	@PutMapping(path="/userinfo/{userid}")
	public Userinfo updateUser(@PathVariable String userid, @RequestBody Userinfo userinfo) {
		return service.updateUser(userid, userinfo);
	}
	
	@DeleteMapping(path="/userinfo/{userid}")
	public Userinfo deleteUser(@PathVariable String userid, @RequestBody Userinfo userinfo) {
		service.deleteUser(userid);
		return userinfo;
	}
}
