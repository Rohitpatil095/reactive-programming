package com.app.reactive.flux.starter;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;

public class FluxStarterService {

	
//	public Flux<String> getUsersData()
//	{
////		return Flux.fromIterable(List.of("ram","sham","jagan")).log();
//		var a= Flux.fromIterable(List.of("ram","sham","jagan")).map(data-> System.out.println("from fun user is "+ "flux user-> "));
//	}

	public Flux<String> getFilteredUsersData(){
		return Flux.fromIterable(
				List.of("ram","sham","jagan","mohan")
				.map(data-> data.toUppercase())
				.filter(data-> {data.length()>3};)
				.log();
	}
	
	public Mono<String> getSingleUserData()
	{
		return Mono.just("goku").log();
	}
	
	public static void main(String[] args) {
		
		FluxStarterService f=new FluxStarterService();
		
		f.getUsersData().subscribe(fluxData-> {System.out.println("user is "+ "flux user-> "+fluxData);});
		
		System.out.println("------------------");
		f.getSingleUserData().subscribe(monoData-> {System.out.println("user is "+ "mono user-> "+monoData); 	});
		
		System.out.println("------------------");
		f.getFilteredUsersData().subscribe(fluxData-> {System.out.println("user is "+ "flux filtered user-> "+ fluxData); 	});
		
	}
}
