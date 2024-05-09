package com.POC.POC_LOGIN.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POC.POC_LOGIN.Models.Userdetails;

@Repository
public interface UserRepo extends JpaRepository<Userdetails,Integer>{
	Userdetails findByusername(String username);
}
