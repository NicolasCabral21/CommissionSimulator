package com.localpayment.commissionsimulator.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.localpayment.commissionsimulator.model.Provider;
import com.localpayment.commissionsimulator.model.ProviderCommission;
import com.localpayment.commissionsimulator.service.ProviderService;
import com.localpayment.commissionsimulator.util.Util;

@Service
public class ProviderServiceImpl implements ProviderService{

	@Override
	public ProviderCommission calculateCommission(Provider data) {
		
		ProviderCommission providerCommission = new ProviderCommission();
		
		providerCommission.setFee(new BigDecimal(Util.generatorFee()));
		providerCommission.setLocaltax(new BigDecimal(Util.generatorLocalTax()));
		
		return providerCommission;
	}

}
