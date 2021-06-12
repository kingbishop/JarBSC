package com.jarbsc.api.tokens;

import com.google.gson.Gson;
import com.jarbsc.api.endpoints.Endpoint;
import com.jarbsc.api.objects.BscResult;
import com.jarbsc.api.util.HttpUtil;

public class Tokens {

	
	
	public Tokens() {
		
	}
	
	
	public void getTotalSupply(String contractAddress) throws Exception {
		String endpoint = Endpoint.TokenUrl.urlTotalSupplyByContractAddress(contractAddress);
		String result = HttpUtil.sendGet(endpoint);	
		Gson gson = new Gson();
		BscResult bscResult = gson.fromJson(result, BscResult.class);
		System.out.println(bscResult.getResult());
	}
	
	
	public void getTokenInfo(String contractAddress) throws Exception {
		String endpoint = Endpoint.TokenUrl.urlTokenInfoByContractAddress(contractAddress);
		HttpUtil.sendGet(endpoint);
	}
	
}
