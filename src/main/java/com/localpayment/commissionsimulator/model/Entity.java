package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Entity {
	private String type;
	private int account;
	private BigDecimal amount;
	private String transactionType;
}
