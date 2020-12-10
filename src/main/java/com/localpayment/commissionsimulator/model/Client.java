package com.localpayment.commissionsimulator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Client {
	private String clientAccount;
	private String amount;
	private String transactionType;
}
