package com.currency.metalrate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.currency.metalrate.controller.MetalExchangeController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MetalExchangeControllerTest {

    @Autowired
    private MetalExchangeController controller;

    @Test
    public void testRetrieveExchangeValue() {
        // Call the method under test
//        ResponseEntity<Double> result = controller.retrieveExchangeValue("GOLD", "USD");
//
//        // Perform assertions
//        assertEquals(150.0, result.getBody());
    }
}
