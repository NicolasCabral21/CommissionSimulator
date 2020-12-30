package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

public class Localtax extends Discount {

	public Localtax(Double percentage, BigDecimal amount) {
		super(percentage, amount);
	}
}
