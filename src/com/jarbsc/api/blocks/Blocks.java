package com.jarbsc.api.blocks;

import com.google.gson.Gson;
import com.jarbsc.api.endpoints.Endpoint;
import com.jarbsc.api.objects.BscResult;
import com.jarbsc.api.util.HttpUtil;

public class Blocks {

	
	public void getBlockRewardByBlockNumber(String blockNumber) throws Exception {
		String endpoint = Endpoint.BlockUrl.urlGetBlockRewardByBlockNumber(blockNumber);
		String result = HttpUtil.sendGet(endpoint);	
		Gson gson = new Gson();
		BscResult bscResult = gson.fromJson(result, BscResult.class);
		
		
		
	}
	
}
