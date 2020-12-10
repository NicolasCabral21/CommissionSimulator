package com.localpayment.commissionsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localpayment.commissionsimulator.model.Provider;
import com.localpayment.commissionsimulator.model.ProviderCommission;
import com.localpayment.commissionsimulator.service.ProviderService;

@RestController
@RequestMapping("/provider")
public class ProviderController {
	
	@Autowired
	private ProviderService providerService;

	@PostMapping("/calculate-commission")
	public ProviderCommission calculateCommission(@RequestBody Provider data) {
		return providerService.calculateCommission(data);
	}
}
