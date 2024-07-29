package com.currency.currencyxchng.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValueDTO {
    @Id
    private Long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private double conversionMultiple;

}
