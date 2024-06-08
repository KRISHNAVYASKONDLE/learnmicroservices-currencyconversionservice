package com.krishnavyas.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange",url="localhost:8000")

//if we dont mention port.if we've eureka.then feign automatically uses eurekas springcloudloadbalancer
@FeignClient(name="currency-exchange-service")

public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable String from,@PathVariable String to);

}
