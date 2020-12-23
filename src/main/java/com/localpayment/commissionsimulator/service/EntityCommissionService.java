package com.localpayment.commissionsimulator.service;

import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Entity;

public interface EntityCommissionService {
	
	Commission calculate(Entity data);
}
