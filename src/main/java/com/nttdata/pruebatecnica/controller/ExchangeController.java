package com.nttdata.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.pruebatecnica.persistence.ExchangeTransaction;
import com.nttdata.pruebatecnica.persistence.ExchangeTransactionRepository;
import com.nttdata.pruebatecnica.service.ExchangeResponse;
import com.nttdata.pruebatecnica.service.ExchangeService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/exchange")
public class ExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;
	
	@Autowired
	 private ExchangeTransactionRepository exchangeTransactionRepository;
	
	//recibe monto, moneda origen, moneda destino y devuelve tipo de cambio
	@PostMapping
	public Mono<ResponseEntity<ExchangeResponse>> convertCurrency(@RequestParam double amount, @RequestParam String currencyFrom, @RequestParam String currencyTo ){
		
		//se obtiene la data usando el servicio
		return exchangeService.getExchange(currencyFrom, currencyTo, amount)
				.map(exchangeRateResponse -> {
		            double rate =  Double.valueOf(exchangeRateResponse.getConversionRate() );  // Obtiene el tipo de cambio
		            double convertedAmount = amount * rate;        // Calcula el monto convertido

		            
		            
		            // Guardar la transacción en la base de datos
		            ExchangeTransaction transaction = new ExchangeTransaction();
		            transaction.setAmount(amount);
		            transaction.setOriginCurrency(currencyFrom);
		            transaction.setDestinationCurrency(currencyTo);
		            transaction.setExchangeRate(rate);
		            transaction.setConvertedAmount(convertedAmount);
		            exchangeTransactionRepository.save(transaction); // Guarda la transacción

		            // Respuesta con los datos calculados
		           // ExchangeResponse response = new ExchangeResponse(amount, convertedAmount, currencyFrom, currencyTo, rate);
		            ExchangeResponse response = new ExchangeResponse(amount,convertedAmount,currencyFrom,currencyTo,rate );
		            return ResponseEntity.ok(response);  // Devuelve la respuesta en formato JSON
		        });
		
		
	}
	
	// Endpoint 2: Listar todas las transacciones de tipo de cambio
    @GetMapping("/transactions")
    public ResponseEntity<List<ExchangeTransaction>> getAllTransactions() {
        List<ExchangeTransaction> transactions = exchangeTransactionRepository.findAll();
        return ResponseEntity.ok(transactions);
    }

}
