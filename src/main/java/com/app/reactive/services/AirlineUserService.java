package com.app.reactive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.reactive.entity.AirlineUser;
import com.app.reactive.repository.AirlineUserRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AirlineUserService{
	@Autowired
	private AirlineUserRepo airRepo;
	
	public Flux<AirlineUser> getAllUsers()
	{
		return airRepo.findAll();
	}
	
	public Mono<AirlineUser> createNewUsers()
	{
		return airRepo.findById(2L);
	}
}
