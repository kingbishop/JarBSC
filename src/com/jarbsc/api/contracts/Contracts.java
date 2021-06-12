package com.jarbsc.api.contracts;

import com.google.gson.Gson;
import com.jarbsc.api.endpoints.Endpoint;
import com.jarbsc.api.objects.BscResult;
import com.jarbsc.api.util.HttpUtil;

public class Contracts {

	
	public String getContractSourceCode(String contractAddress) throws Exception {
		String endpoint = Endpoint.ContractUrl.urlGetVerifiedContractSourceCode(contractAddress);
		String result = HttpUtil.sendGet(endpoint);	
		Gson gson = new Gson();
		BscResult bscResult = gson.fromJson(result, BscResult.class);
		return bscResult.getResult();
	}
	
}
