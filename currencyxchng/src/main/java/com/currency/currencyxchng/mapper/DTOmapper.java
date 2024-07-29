package com.currency.currencyxchng.mapper;

import com.currency.currencyxchng.dto.ExchangeValueDTO;
import com.currency.currencyxchng.model.ExchangeValue;

public class DTOmapper {

    public static ExchangeValueDTO mapToDTO(ExchangeValue currency){
        return new ExchangeValueDTO(currency.getId(), currency.getFrom(), currency.getTo(), currency.getConversionMultiple());
    }

    public static  ExchangeValue mapFromDTO(ExchangeValueDTO currencyDTO){
        return new ExchangeValue(currencyDTO.getId(), currencyDTO.getFrom(), currencyDTO.getTo(), currencyDTO.getConversionMultiple());
    }
}
