package com.POC.POC_LOGIN.Services;

import java.util.List;

import com.POC.POC_LOGIN.Dto.Logindto;
import com.POC.POC_LOGIN.Models.Userdetails;

public interface Userservices {

	Boolean adduser(Userdetails user);
	List<Userdetails> alluser();
	Boolean login(Logindto logindto);
}
