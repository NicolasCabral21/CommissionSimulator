package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

public class Withholding extends Discount {

	public Withholding(Double percentage, BigDecimal amount) {
		super(percentage, amount);
	}
}
