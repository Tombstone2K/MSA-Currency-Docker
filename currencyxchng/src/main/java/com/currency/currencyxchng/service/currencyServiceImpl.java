package com.currency.currencyxchng.service;

import com.currency.currencyxchng.dto.ExchangeValueDTO;
import com.currency.currencyxchng.mapper.DTOmapper;
import com.currency.currencyxchng.model.ExchangeValue;
import com.currency.currencyxchng.repository.ExchangeValueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class currencyServiceImpl implements currencyService {

    private ExchangeValueRepository repo;

    @Override
    public ExchangeValueDTO findByFromAndTo(String from,String to){
        ExchangeValue temp = repo.findByFromAndTo(from,to);
        return DTOmapper.mapToDTO(temp);

    }

}
