package com.app.reactive.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class AirlineUser {
	Long id;
	int minimum_nights ;
	String name;
	String summary;
}
