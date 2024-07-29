package com.currency.metalrate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.metalrate.model.MetalValue ;
import com.currency.metalrate.repository.MetalValueRepository;

import java.util.Optional;

@RestController
public class MetalExchangeController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private MetalValueRepository repository;
	
	@GetMapping("/metal-exchange/from/{from}/to/{to}")
	public ResponseEntity<Double> retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		MetalValue metalExchange = repository.findByFromAndTo(from, to);
		System.out.println(metalExchange);
		if (metalExchange == null) {
			System.out.println("NULL HERE");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		double conversionMultiple = metalExchange.getConversionMultiple();
		return ResponseEntity.ok(conversionMultiple);
//		double conversionMultiple = repository.findByFromAndTo(from, to).getConversionMultiple();
//		return conversionMultiple;
	}
}