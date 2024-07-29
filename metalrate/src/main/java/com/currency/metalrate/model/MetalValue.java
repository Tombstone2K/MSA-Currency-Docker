package com.currency.metalrate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metal_value")
public class MetalValue {

	@Id
	private Long id;
	@Column(name="metal_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private double conversionMultiple;

}
