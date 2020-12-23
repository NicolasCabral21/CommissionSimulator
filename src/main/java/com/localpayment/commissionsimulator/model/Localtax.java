package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Localtax {
	private Double percentage;
	private BigDecimal amount;
}
