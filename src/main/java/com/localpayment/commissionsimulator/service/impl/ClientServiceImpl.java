package com.localpayment.commissionsimulator.service.impl;

import org.springframework.stereotype.Service;

import com.localpayment.commissionsimulator.model.Client;
import com.localpayment.commissionsimulator.model.ClientCommission;
import com.localpayment.commissionsimulator.model.Fee;
import com.localpayment.commissionsimulator.model.Localtax;
import com.localpayment.commissionsimulator.model.Witholding;
import com.localpayment.commissionsimulator.service.ClientService;
import com.localpayment.commissionsimulator.util.Util;

@Service
public class ClientServiceImpl implements ClientService {

	@Override
	public ClientCommission calculateCommission(Client data) {
		
		ClientCommission clientCommission = new ClientCommission();
		
		Fee fee1 = new Fee();
		fee1.setFee(Double.valueOf(Util.generatorFee()));
		
		Fee fee2 = new Fee();
		fee2.setFee(Double.valueOf(Util.generatorFee()));
		
		Fee[] fees = { fee1, fee2 };
		
		//----------------------------------------------------------
		
		Localtax localtax1 = new Localtax();
		localtax1.setLocaltax(Double.valueOf(Util.generatorLocaltax()));
		
		Localtax localtax2 = new Localtax();
		localtax2.setLocaltax(Double.valueOf(Util.generatorLocaltax()));
		
		Localtax[] localtaxes = { localtax1, localtax2 };
		
		//----------------------------------------------------------
		
		Witholding witholding1 = new Witholding();
		witholding1.setWitholding(Double.valueOf(Util.generatorWitholding()));
		
		Witholding witholding2 = new Witholding();
		witholding2.setWitholding(Double.valueOf(Util.generatorWitholding()));
		
		Witholding[] witholdings = { witholding1 , witholding2 };
		
		//----------------------------------------------------------
		
		clientCommission.setFees(fees);
		clientCommission.setLocaltaxes(localtaxes);
		clientCommission.setWitholdings(witholdings);
		
		return clientCommission;
	}

}
