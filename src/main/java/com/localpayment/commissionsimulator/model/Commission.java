package com.localpayment.commissionsimulator.model;

import lombok.Data;

@Data
public abstract class Commission {
	private Fee[] fees;
	private Localtax[] localtaxes;
	private Withholding[] witholdings;
}
