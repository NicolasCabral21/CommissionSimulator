package com.localpayment.commissionsimulator.service.impl;

import org.springframework.stereotype.Service;

import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Data;
import com.localpayment.commissionsimulator.service.CommissionService;
import com.localpayment.commissionsimulator.util.Util;

@Service
public class CommissionServiceImpl implements CommissionService{

	@Override
	public Commission calculateCommission(Data data) {
		
		Commission commission = new Commission();
		
		commission.setFee(Double.valueOf(Util.generatorFee()));
		commission.setLocaltax(Double.valueOf(Util.generatorLocalTax()));
		
		return commission;
	}

}
