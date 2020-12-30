package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Discount {
	private Double percentage;
	private BigDecimal amount;
}
