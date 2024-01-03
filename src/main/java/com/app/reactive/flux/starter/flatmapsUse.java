package com.app.reactive.flux.starter;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import reactor.core.publisher.Flux;

public class flatmapsUse {
	
	public Flux<String> flatMapsDemoDiff()
	{
		return Flux.fromIterable(List.of("ram","sham"))
				.map(user -> user.toUpperCase())
				.log();
	}
	
	public Flux<String> flatMapsDemo()
	{
		return Flux.fromIterable(List.of("rama","shama"))
				.filter(user-> user.length()>3)
				.flatMap(user-> splitIt(user))
				.log();
	}

	public Flux<String> flatMapsDemoWithDelay()
	{
		return Flux.fromIterable(List.of("rama","shama"))
				.filter(user-> user.length()>3)
				.flatMap(user-> splitItWithDelay(user))
				.log();
	}
	public Flux<String> splitIt(String str)
	{
		return Flux.fromArray(str.split(""));
	}
	
	public Flux<String> splitItWithDelay(String str)
	{
		return Flux.fromArray(str.split(""))
				.delayElements(Duration.ofMillis(new Random().nextInt(1000)));
	}	
	
	public static void main(String[] args) {
		flatmapsUse fm= new flatmapsUse();
		System.out.println(fm.flatMapsDemo().subscribe());
		
		System.out.println("---------");
		System.out.println(fm.flatMapsDemoWithDelay().subscribe().toString());
	}

}
