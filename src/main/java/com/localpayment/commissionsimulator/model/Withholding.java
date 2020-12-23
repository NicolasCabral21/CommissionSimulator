package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Withholding {
	private Double percentage;
	private BigDecimal amount;
}
