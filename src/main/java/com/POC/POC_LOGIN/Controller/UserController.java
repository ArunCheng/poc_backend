package com.POC.POC_LOGIN.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.POC.POC_LOGIN.Dto.Logindto;
import com.POC.POC_LOGIN.Models.Userdetails;
import com.POC.POC_LOGIN.Services.Userservices;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public Userservices userServices;
	
	@PostMapping("/adduser")
	public Map<String, String> adduser(@RequestBody Userdetails user)
	{
		HashMap<String, String> map = new HashMap<>();
		System.out.println("1");
		Boolean ans=userServices.adduser(user);
		if(ans)
		{
			map.put("message", "successfully saved");
		}
		else
		{
			map.put("message", "error in saving");
		}
		return map;
		
	}
	
	@GetMapping("/alluser")
	public List<Userdetails> alluser()
	{
		
		return userServices.alluser();
		
	}
	
	@PostMapping("/login")
	public Map<String, String> login(@RequestBody Logindto logindto)
	{
		HashMap<String, String> map = new HashMap<>();
		Boolean ans=userServices.login(logindto);
		if(ans)
		{
			map.put("message", "valid user");
		}
		else
		{
			map.put("message", "invalid user");
		}
		return map;
		
	}
	

}
