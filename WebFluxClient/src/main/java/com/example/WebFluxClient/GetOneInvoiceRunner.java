package com.example.WebFluxClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


import reactor.core.publisher.Mono;

@Component
public class GetOneInvoiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		WebClient client = WebClient.create("http://localhost:8080");
		Mono<Invoice> mono= client
				.get()
				.uri("/invoice/get/1")
				.retrieve()
				.bodyToMono(Invoice.class);
		mono.subscribe(System.out::println);
	}

}