package com.jarbsc.api.util;

public class EthConverter {

	
	public static final double wei = 1000000000000000000L;
	public static final double kwei = 1000000000000000L;
	public static final double mwei = 1000000000000L;
	public static final double gwei = 1000000000L;
	public static final double ether = 1L;
	
	
	public static double wei2eth(long amt) {
		return amt/wei;
	}
	
	public static double kwei2Eth(long amt) {
		return amt/kwei;
	}
	
	public static double mwei2Eth(long amt) {
		return amt/mwei;
	}
	
	public static double gwei2Eth(long amt) {
		return amt/gwei;
	}
	
	public static double eth2wei(double amt) {
		return amt * wei;
	}
	
	public static double eth2kwei(double amt) {
		return amt * kwei;
	}
	
	public static double eth2mwei(double amt) {
		return amt * mwei;
	}
	
	public static double eth2gwei(double amt) {
		return amt * gwei;
	}
	
}
