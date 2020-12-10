package com.localpayment.commissionsimulator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Commission {
	private Double fee;
	private Double localtax;
}
