package com.localpayment.commissionsimulator.service;

import com.localpayment.commissionsimulator.model.Client;
import com.localpayment.commissionsimulator.model.ClientCommission;

public interface ClientService {

	ClientCommission calculateCommission(Client data);
}
