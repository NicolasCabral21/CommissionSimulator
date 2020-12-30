package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

public class Fee extends Discount {

	public Fee(Double percentage, BigDecimal amount) {
		super(percentage, amount);
	}
}