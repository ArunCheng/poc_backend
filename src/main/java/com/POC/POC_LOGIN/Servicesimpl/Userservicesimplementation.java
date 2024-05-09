package com.POC.POC_LOGIN.Servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.POC.POC_LOGIN.Dto.Logindto;
import com.POC.POC_LOGIN.Models.Userdetails;
import com.POC.POC_LOGIN.Services.Userservices;
import com.POC.POC_LOGIN.repo.UserRepo;

@Service
public class Userservicesimplementation implements Userservices{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public Boolean adduser(Userdetails user)
	{
		try
		{
		userRepo.save(user);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<Userdetails> alluser()
	{
		return userRepo.findAll();
	}
	
	@Override
	public Boolean login(Logindto logindto)
	{
		String username=logindto.getUsername();
		String password=logindto.getPassword();
		Userdetails details=userRepo.findByusername(username);
		if((details.getPassword()).equals(password))
		{
		return true;
		}
		else
		{
			return false;
		}
	}
}
