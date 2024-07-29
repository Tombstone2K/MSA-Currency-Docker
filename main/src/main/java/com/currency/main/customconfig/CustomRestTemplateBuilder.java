package com.currency.main.customconfig;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRestTemplateBuilder {

    @Bean("restTemplateBuilder")
    public RestTemplateBuilder getRestTemplateBuilder() {
        return new RestTemplateBuilder();
    }
}
