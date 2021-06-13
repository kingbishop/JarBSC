package com.jarbsc.api.objects;

public class PriceInfo {

	
	private String ethbtc;
	private String ethbtc_timestamp;
	private String ethusd;
	private String ethusd_timestamp;
	
	
	public String getBtcTimestamp() {
		return ethbtc_timestamp;
	}
	
	public String getUsdTimestamp() {
		return ethusd_timestamp;
	}
	
	public String getBtc() {
		return ethbtc;
	}
	
	public String getUsd() {
		return ethusd;
	}
	
}
