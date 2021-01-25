package com.localpayment.commissionsimulator.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fx")
public class FxMockController {

	Map<Integer, BigDecimal> prices = new HashMap<>();
	
	@PostConstruct
	private void initialize() {
//		prices.put(218, BigDecimal.valueOf(4.23));
//		//prices.put(267, BigDecimal.valueOf(140.0));
//		prices.put(267, BigDecimal.valueOf(10.0));
//		prices.put(270, BigDecimal.valueOf(1.99));
//		prices.put(287, BigDecimal.valueOf(0.12));
//		prices.put(288, BigDecimal.valueOf(0.024));
//		prices.put(299, BigDecimal.valueOf(16.13));
		//prices.put(305, BigDecimal.ONE);
		prices.put(60, BigDecimal.ONE);		// ARS
		prices.put(55, BigDecimal.ONE);		// BRL
		prices.put(77, BigDecimal.ONE);		// COP
		prices.put(79, BigDecimal.ONE);		// CLP
		prices.put(95, BigDecimal.ONE);		// UYU
		prices.put(147, BigDecimal.valueOf(20));		// MXN
		prices.put(98, BigDecimal.valueOf(10.0));		// USD
	}
	
	@GetMapping("/price")
	public BigDecimal getCurrencyPriceQuote(@RequestParam("currency") int currencyId) {
		return prices.get(currencyId);
	}
}
