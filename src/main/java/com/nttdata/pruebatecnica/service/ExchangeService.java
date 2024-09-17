package com.nttdata.pruebatecnica.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ExchangeService {
	
	private final WebClient webClient;

	
	public ExchangeService(WebClient.Builder  webClientBuilder) {

		this.webClient = webClientBuilder.baseUrl("https://v6.exchangerate-api.com/v6/bf3f498c253f1459de3ecfa0").build();
	}
	
	//usando mono porque es solo una entidad
	public Mono<ExchangeRateResponse> getExchange(String currencyFrom, String currencyTo, double amount){
		
		return this.webClient.get()
				.uri("/pair/{from}/{to}/{amount}",currencyFrom,currencyTo,amount)
				.retrieve()
				.bodyToMono(ExchangeRateResponse.class);
	}
	
	
	
	

}
