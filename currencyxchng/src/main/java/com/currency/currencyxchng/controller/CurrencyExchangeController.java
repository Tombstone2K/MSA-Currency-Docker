package com.currency.currencyxchng.controller;

import com.currency.currencyxchng.dto.ExchangeValueDTO;
import com.currency.currencyxchng.service.currencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.currencyxchng.model.ExchangeValue ;
import com.currency.currencyxchng.repository.ExchangeValueRepository;

import java.util.Optional;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private currencyService repository;

	@GetMapping("/")
	public String up(){
		return "UP";
	}
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ResponseEntity<Double> retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValueDTO currencyExchange = repository.findByFromAndTo(from, to);
		if (currencyExchange == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		double conversionMultiple = currencyExchange.getConversionMultiple();
		return ResponseEntity.ok(conversionMultiple);

//		double conversionMultiple = repository.findByFromAndTo(from, to).getConversionMultiple();
//		return conversionMultiple;
	}
}