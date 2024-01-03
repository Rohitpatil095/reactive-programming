package com.app.reactive.flux.starter;

import java.util.List;
import java.util.function.Function;

import reactor.core.publisher.Flux;

public class transformOperatorUse {
	flatmapsUse flu=new flatmapsUse();
	
	public Flux<String> playing()
	{
		Function<Flux<String>,Flux<String>> filterIp= name->
			name.map(String::toUpperCase)
			.filter(le-> le.length()>3)
			.flatMap(le-> flu.splitIt(le));
			

		
		return Flux.fromIterable(List.of("sham")).transform(filterIp).log();
	}
	
	public static void main(String[] args) {
		
		transformOperatorUse tf= new transformOperatorUse();
		System.out.println(tf.playing().subscribe());
		
	}

}
