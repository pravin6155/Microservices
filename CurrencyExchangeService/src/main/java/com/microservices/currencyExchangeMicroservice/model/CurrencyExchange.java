package com.microservices.currencyExchangeMicroservice.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchange {
	
	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	

}
