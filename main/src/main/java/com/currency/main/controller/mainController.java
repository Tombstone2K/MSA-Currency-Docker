package com.currency.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class mainController {

    @Autowired
    private Environment environment;

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/sell")
    public ResponseEntity retrieveExchangeValue(@RequestParam String metal,
                                        @RequestParam String currency,
                                        @RequestParam double qty) {


        try{
            String url = "http://metal:8082/metal-exchange/from/" + metal + "/to/" + "USD";
            ResponseEntity<Double> responseUSD = restTemplate.getForEntity(url, Double.class);
            if (responseUSD.getStatusCode() == HttpStatus.OK) {
            } else {
                return ResponseEntity.status(responseUSD.getStatusCode()).body("Incorrect Metal entered");
            }

            url = "http://currency:8081/currency-exchange/from/" + "USD" + "/to/" + currency;
            ResponseEntity<Double> responseCurrency = restTemplate.getForEntity(url, Double.class);

            if (responseUSD.getStatusCode() == HttpStatus.OK) {
            } else {
                return ResponseEntity.status(responseUSD.getStatusCode()).body("Incorrect Currency entered");
            }

            return ResponseEntity.status(HttpStatus.OK).body(qty*responseCurrency.getBody()*responseUSD.getBody());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("INVALID METAL/CURRENCY ENTERED");
        }

    }
}