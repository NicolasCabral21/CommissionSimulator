package com.localpayment.commissionsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Entity;
import com.localpayment.commissionsimulator.service.EntityCommissionService;

@RestController
@RequestMapping("/entity")
public class EntityController {

	@Autowired
	private EntityCommissionService clientService;

	@PostMapping("/calculate")
	public Commission calculateCommission(@RequestBody Entity data) {
		return clientService.calculate(data);
	}
}
