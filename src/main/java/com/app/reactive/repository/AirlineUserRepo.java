package com.app.reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.app.reactive.entity.AirlineUser;

public interface AirlineUserRepo extends ReactiveMongoRepository<AirlineUser, Long> {

}
