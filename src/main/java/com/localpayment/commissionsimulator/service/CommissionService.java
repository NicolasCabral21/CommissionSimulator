package com.localpayment.commissionsimulator.service;

import com.localpayment.commissionsimulator.model.Commission;
import com.localpayment.commissionsimulator.model.Data;

public interface CommissionService {

	Commission calculateCommission(Data data);
}
