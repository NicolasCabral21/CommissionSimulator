package com.localpayment.commissionsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Data;
import com.localpayment.commissionsimulator.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

	@Autowired
	private CommissionService commissionService;
	
	@PostMapping("/calculate-commission")
	public Commission calculateCommission(@RequestBody Data data) {
		return commissionService.calculateCommission(data);
	}
}
