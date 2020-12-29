package com.localpayment.commissionsimulator.model;

import lombok.Data;

@Data
public abstract class Commission {
	private Fee fee;
	private Localtax localtax;
	private Withholding withholding;
}
