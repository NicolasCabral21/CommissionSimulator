package com.localpayment.commissionsimulator.util;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class Util {
	
	public static Double generatorFee() {
		Double[] fee = {0.02, 0.021, 0.022, 0.023, 0.024};
	    
	    return fee[returnRandomNumber(fee)];
	}
	
	public static Double generatorLocaltax() {
		Double[] localTax = {0.01, 0.011, 0.012, 0.013, 0.014};
	    
	    return localTax[returnRandomNumber(localTax)];
	}
	
	public static Double generatorWitholding() {
		Double[] withholding = {0.01, 0.011, 0.012, 0.013, 0.014};
	    
	    return withholding[returnRandomNumber(withholding)];
	}
	
	private static int returnRandomNumber(Double[] array) {
		return ThreadLocalRandom.current().nextInt(0, array.length - 1);
	}
	
	private Util() {
		
	}
}
