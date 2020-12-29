package com.localpayment.commissionsimulator.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.localpayment.commissionsimulator.model.ClientCommission;
import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Entity;
import com.localpayment.commissionsimulator.model.Fee;
import com.localpayment.commissionsimulator.model.Localtax;
import com.localpayment.commissionsimulator.model.Provider;
import com.localpayment.commissionsimulator.model.ProviderCommission;
import com.localpayment.commissionsimulator.model.Withholding;
import com.localpayment.commissionsimulator.service.EntityCommissionService;

@Service
public class EntityCommissionServiceImpl implements EntityCommissionService {

	@Override
	public Commission calculate(Entity data) {
		Commission commission;
		
		if (data instanceof Provider) {
			commission = new ProviderCommission();
		} else {
			commission = new ClientCommission();
		}
		
		Fee fee = calculateFee(data);
		Localtax localtax = calculateLocalTax(data);
		Withholding witholding = calculateWithholding(data);
		
//		commission.setFee(new Fee[] { fee });
//		commission.setLocaltax(new Localtax[] { localtax });
//		commission.setWitholding(new Withholding[] {witholding});
		
		commission.setFee(fee);
		commission.setLocaltax(localtax);
		commission.setWithholding(witholding);
		
		return commission;
	}
	
	private Fee calculateFee(Entity data) {
		Fee fee1 = new Fee();
		fee1.setPercentage(getPercentageByEntityAccount(data.getAccount()));
		fee1.setAmount(data.getAmount().multiply(BigDecimal.valueOf(fee1.getPercentage())));
		
		return fee1;
	}
	
	private Localtax calculateLocalTax(Entity data) {
		Localtax localtax1 = new Localtax();
		localtax1.setPercentage(getPercentageByEntityAccount(data.getAccount()));
		localtax1.setAmount(data.getAmount().multiply(BigDecimal.valueOf(localtax1.getPercentage())));
		
		return localtax1;
	}
	
	private Withholding calculateWithholding(Entity data) {
		Withholding witholding1 = new Withholding();
		witholding1.setPercentage(getPercentageByEntityAccount(data.getAccount()));
		witholding1.setAmount(data.getAmount().multiply(BigDecimal.valueOf(witholding1.getPercentage())));
		
		return witholding1;
	}
	
	private Double getPercentageByEntityAccount(String account) {
		Double percentage = null;
		switch (account) {
		case "PAYOARGARS01":
			percentage = 0.02;
			break;
		case "PAYOARGUSD01":
			percentage = 0.01;
			break;
		case "THUNCHLUSD01":
			percentage = 0.03;
			break;
		case "032.840.000001":
			percentage = 0.025;
			break;
		default:
			percentage = 0.05;
		}
		return percentage;
	}
}
