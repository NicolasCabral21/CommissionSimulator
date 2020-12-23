package com.localpayment.commissionsimulator.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Entity;
import com.localpayment.commissionsimulator.model.Fee;
import com.localpayment.commissionsimulator.model.Localtax;
import com.localpayment.commissionsimulator.model.ProviderCommission;
import com.localpayment.commissionsimulator.model.Withholding;
import com.localpayment.commissionsimulator.service.EntityCommissionService;
import com.localpayment.commissionsimulator.util.Util;

@Service
public class EntityCommissionServiceImpl implements EntityCommissionService {

	@Override
	public Commission calculate(Entity data) {
		
		ProviderCommission providerCommission = new ProviderCommission();
		
		Fee[] fees = calculateFees(data);
		
		Localtax[] localtaxes = calculateLocalTaxes(data);
		
		Withholding[] witholdings = calculateWithholdings(data);
		
		providerCommission.setFees(fees);
		providerCommission.setLocaltaxes(localtaxes);
		providerCommission.setWitholdings(witholdings);
		
		return providerCommission;
	}
	
	private Fee[] calculateFees(Entity data) {
		Fee fee1 = new Fee();
		fee1.setPercentage(Util.generatorFee());
		fee1.setAmount(data.getAmount().multiply(BigDecimal.valueOf(fee1.getPercentage())));
		
		Fee fee2 = new Fee();
		fee2.setPercentage(Util.generatorFee());
		fee2.setAmount(data.getAmount().multiply(BigDecimal.valueOf(fee2.getPercentage())));
		
		return new Fee[] { fee1, fee2 };
	}
	
	private Localtax[] calculateLocalTaxes(Entity data) {
		Localtax localtax1 = new Localtax();
		localtax1.setPercentage(Util.generatorLocaltax());
		localtax1.setAmount(data.getAmount().multiply(BigDecimal.valueOf(localtax1.getPercentage())));
		
		Localtax localtax2 = new Localtax();
		localtax2.setPercentage(Util.generatorLocaltax());
		localtax2.setAmount(data.getAmount().multiply(BigDecimal.valueOf(localtax2.getPercentage())));
		
		return new Localtax[] { localtax1, localtax2 };
	}
	
	private Withholding[] calculateWithholdings(Entity data) {
		Withholding witholding1 = new Withholding();
		witholding1.setPercentage(Util.generatorWitholding());
		witholding1.setAmount(data.getAmount().multiply(BigDecimal.valueOf(witholding1.getPercentage())));
		
		Withholding witholding2 = new Withholding();
		witholding2.setPercentage(Util.generatorWitholding());
		witholding2.setAmount(data.getAmount().multiply(BigDecimal.valueOf(witholding2.getPercentage())));
		
		return new Withholding[] { witholding1 , witholding2 };
	}
}
