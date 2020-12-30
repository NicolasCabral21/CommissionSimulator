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
		prices.put(218, BigDecimal.valueOf(4.23));
		prices.put(267, BigDecimal.valueOf(84.04));
		prices.put(270, BigDecimal.valueOf(1.99));
		prices.put(287, BigDecimal.valueOf(0.12));
		prices.put(288, BigDecimal.valueOf(0.024));
		prices.put(299, BigDecimal.valueOf(16.13));
	}
	
	@GetMapping("/price")
	public BigDecimal getCurrencyPriceQuote(@RequestParam("currency") int currencyId) {
		return prices.get(currencyId);
	}
}
