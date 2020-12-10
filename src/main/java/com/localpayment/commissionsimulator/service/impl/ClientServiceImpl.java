package com.localpayment.commissionsimulator.service.impl;

import org.springframework.stereotype.Service;

import com.localpayment.commissionsimulator.model.Client;
import com.localpayment.commissionsimulator.model.ClientCommission;
import com.localpayment.commissionsimulator.service.ClientService;
import com.localpayment.commissionsimulator.util.Util;

@Service
public class ClientServiceImpl implements ClientService {

	@Override
	public ClientCommission calculateCommission(Client data) {
		
		ClientCommission clientCommission = new ClientCommission();
		
		clientCommission.setFee(Double.valueOf(Util.generatorFee()));
		clientCommission.setLocaltax(Double.valueOf(Util.generatorLocalTax()));
		
		return clientCommission;
	}

}
