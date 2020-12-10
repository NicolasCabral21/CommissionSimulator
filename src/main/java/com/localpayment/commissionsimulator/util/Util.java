package com.localpayment.commissionsimulator.util;

public class Util {
	
	public static String generatorFee() {
		String[] fee = {"2.0","2.1","2.2","2.3","2.4"};
	    
	    int numero = (int) (Math.random()* (4 - 0) + 0);
	    
	    return fee[numero];
	}
	
	public static String generatorLocalTax() {
	    String[] localTax = {"1.0","1.1","1.2","1.3","1.4"};
	    
	    int numero = (int) (Math.random()* (4 - 0) + 0);
	    
	    return localTax[numero];
	}
}
