package com.localpayment.commissionsimulator.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProviderCommission {
	private BigDecimal fee;
	private BigDecimal localtax;
}
