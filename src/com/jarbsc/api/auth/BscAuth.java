package com.jarbsc.api.auth;

public class BscAuth {

	
	private static String apiKey = "";
	
	public static void setApiKey(String apiKey) {
		BscAuth.apiKey = apiKey;
	}
	
	public static String getApiKey() {
		return apiKey;
	}
	
	
}
