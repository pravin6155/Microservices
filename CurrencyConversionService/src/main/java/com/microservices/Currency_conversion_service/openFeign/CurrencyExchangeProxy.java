package com.microservices.Currency_conversion_service.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.Currency_conversion_service.model.CurrencyConversion;


//@FeignClient(name = "Currency-Exchange", url="localhost:8000")
@FeignClient(name = "Currency-Exchange")
public interface CurrencyExchangeProxy {
	 	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retriveExchangevalue(
			@PathVariable String from,
			@PathVariable String to);

}
