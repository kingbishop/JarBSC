package com.jarbsc.api.util;

public class EthUnit {

	
	public static final double wei = 1000000000000000000L;
	public static final double kwei = 1000000000000000L;
	public static final double mwei = 1000000000000L;
	public static final double gwei = 1000000000L;
	public static final double ether = 1L;
	
	
	public static double wei2eth(long amt) {
		return amt/wei;
	}
	
	public static double eth2wei(double amt) {
		return amt * wei;
	}
	
}
