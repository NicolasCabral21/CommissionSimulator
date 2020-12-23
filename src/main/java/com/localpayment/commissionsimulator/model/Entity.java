package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Entity {
	private String providerAccount;
	private BigDecimal amount;
	private String transactionType;
}
