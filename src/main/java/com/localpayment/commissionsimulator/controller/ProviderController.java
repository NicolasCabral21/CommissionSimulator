package com.localpayment.commissionsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Provider;
import com.localpayment.commissionsimulator.service.EntityCommissionService;

@RestController
@RequestMapping("/provider")
public class ProviderController {
	
	@Autowired
	private EntityCommissionService providerService;

	@PostMapping("/calculate-commission")
	public Commission calculateCommission(@RequestBody Provider data) {
		return providerService.calculate(data);
	}
}
