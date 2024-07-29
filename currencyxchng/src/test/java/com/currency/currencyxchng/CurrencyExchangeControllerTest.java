package com.currency.currencyxchng;

import com.currency.currencyxchng.controller.CurrencyExchangeController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CurrencyExchangeControllerTest {

    @Autowired
    private CurrencyExchangeController controller;

    @Test
    public void testRetrieveExchangeValue() {
        // Call the method under test
//        ResponseEntity<Double> result = controller.retrieveExchangeValue("USD", "INR");
//
//        // Perform assertions
//        assertEquals(70.0, result.getBody());
    }
}
