package com.localpayment.commissionsimulator.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.localpayment.commissionsimulator.model.ClientCommission;
import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Entity;
import com.localpayment.commissionsimulator.model.Fee;
import com.localpayment.commissionsimulator.model.Localtax;
import com.localpayment.commissionsimulator.model.ProviderCommission;
import com.localpayment.commissionsimulator.model.Withholding;
import com.localpayment.commissionsimulator.service.EntityCommissionService;

@Service
public class EntityCommissionServiceImpl implements EntityCommissionService {
	
	@Override
	public Commission calculate(Entity data) {
		if (data.getType().equalsIgnoreCase("P")) {
			return buildProviderCommission(data);
		} else {
			return buildClientCommission(data);
		}
	}
	
	private Commission buildProviderCommission(Entity data) {
		Commission commission = new ProviderCommission();
		
		switch (data.getAccount()) {
		case "032.840.000001":	// Bco. Galicia
			commission.setFee(new Fee(0.01, data.getAmount().multiply(BigDecimal.valueOf(0.01))));
			//commission.setFee(new Fee(0.02, data.getAmount().multiply(BigDecimal.valueOf(0.02))));
			commission.setLocaltax(new Localtax(0.012, data.getAmount().multiply(BigDecimal.valueOf(0.012))));
			commission.setWithholding(new Withholding(0.001, data.getAmount().multiply(BigDecimal.valueOf(0.001))));
			break;
		case "182-5058/7":		// Bco. Francés
			commission.setFee(new Fee(0.03, data.getAmount().multiply(BigDecimal.valueOf(0.03))));
			commission.setLocaltax(new Localtax(0.06, data.getAmount().multiply(BigDecimal.valueOf(0.06))));
			commission.setWithholding(new Withholding(0.002, data.getAmount().multiply(BigDecimal.valueOf(0.002))));
			break;
		default:
			
		}
		
		return commission;
	}
	
	private Commission buildClientCommission(Entity data) {
		Commission commission = new ClientCommission();
		
		switch (data.getAccount()) {
		case "PAYOARGARS01":
			commission.setFee(new Fee(0.01, data.getAmount().multiply(BigDecimal.valueOf(0.01))));
			commission.setLocaltax(new Localtax(0.04, data.getAmount().multiply(BigDecimal.valueOf(0.04))));
			commission.setWithholding(new Withholding(0.003, data.getAmount().multiply(BigDecimal.valueOf(0.003))));
			break;
		case "PAYOARGUSD01":
			commission.setFee(new Fee(0.02, data.getAmount().multiply(BigDecimal.valueOf(0.02))));
			//commission.setFee(new Fee(0.01, data.getAmount().multiply(BigDecimal.valueOf(0.01))));
			commission.setLocaltax(new Localtax(0.012, data.getAmount().multiply(BigDecimal.valueOf(0.012))));
			commission.setWithholding(new Withholding(0.002, data.getAmount().multiply(BigDecimal.valueOf(0.002))));
			break;
		case "THUNCHLUSD01":
			commission.setFee(new Fee(0.02, data.getAmount().multiply(BigDecimal.valueOf(0.02))));
			//commission.setFee(new Fee(0.01, data.getAmount().multiply(BigDecimal.valueOf(0.01))));
			commission.setLocaltax(new Localtax(0.012, data.getAmount().multiply(BigDecimal.valueOf(0.012))));
			commission.setWithholding(new Withholding(0.002, data.getAmount().multiply(BigDecimal.valueOf(0.002))));
			break;
		default:
			
		}
		
		return commission;
	}
}
