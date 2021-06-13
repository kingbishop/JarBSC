package com.jarbsc.api.accounts;

import com.google.gson.Gson;
import com.jarbsc.api.endpoints.Endpoint;
import com.jarbsc.api.objects.BscResult;
import com.jarbsc.api.util.EthUnit;
import com.jarbsc.api.util.HttpUtil;

public class Accounts {

	public Accounts() {
	
	}
	
	public String getBnbBalanceForAddress(String address) throws Exception {
		String endpoint = Endpoint.AccountUrl.urlGetBnbBalanceForAddress(address);
		String result = HttpUtil.sendGet(endpoint);	
		Gson gson = new Gson();
		BscResult bscResult = gson.fromJson(result, BscResult.class);
		try {
			long weiResult = Long.parseLong(bscResult.getResult());
			return Double.toString(EthUnit.wei2eth(weiResult));
		}catch(Exception e) {
			
		}
		throw new Exception("Unable to parse result.");
	}
	
}
