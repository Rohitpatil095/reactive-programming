package com.app.reactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.reactive.entity.AirlineUser;
import com.app.reactive.services.AirlineUserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveControllers {
	
	@Autowired
	private AirlineUserService AService;
	
	@GetMapping("/")
	@ResponseStatus(value = HttpStatus.OK)
	public Flux<AirlineUser> getUsers()
	{
		return AService.getAllUsers();
	}

}
