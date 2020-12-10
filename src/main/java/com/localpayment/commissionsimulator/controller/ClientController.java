package com.localpayment.commissionsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localpayment.commissionsimulator.model.Client;
import com.localpayment.commissionsimulator.model.ClientCommission;
import com.localpayment.commissionsimulator.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping("/calculate-commission")
	public ClientCommission calculateCommission(@RequestBody Client data) {
		return clientService.calculateCommission(data);
	}
}
