package com.currency.currencyxchng.service;

import com.currency.currencyxchng.dto.ExchangeValueDTO;
import com.currency.currencyxchng.model.ExchangeValue;

public interface currencyService {
    ExchangeValueDTO findByFromAndTo(String from, String to);
}
