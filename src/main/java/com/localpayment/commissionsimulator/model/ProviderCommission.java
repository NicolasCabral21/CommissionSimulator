package com.localpayment.commissionsimulator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProviderCommission {
	private Fee[] fees;
	private Localtax[] localtaxes;
	private Witholding[] witholdings;
}
