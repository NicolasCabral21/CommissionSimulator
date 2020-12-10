package com.localpayment.commissionsimulator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Provider {
	private String providerAccount;
	private String amount;
	private String transactionType;
}
