package com.localpayment.commissionsimulator.service;

import com.localpayment.commissionsimulator.model.Provider;
import com.localpayment.commissionsimulator.model.ProviderCommission;

public interface ProviderService {

	ProviderCommission calculateCommission(Provider data);

}
