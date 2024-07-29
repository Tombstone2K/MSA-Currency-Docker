package com.currency.currencyxchng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currency.currencyxchng.model.ExchangeValue ;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
//    void findByFromAndTo();
    ExchangeValue findByFromAndTo(String from,String to);

}
