package com.jarbsc.api.geth;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.jarbsc.api.endpoints.Endpoint;
import com.jarbsc.api.objects.Block;
import com.jarbsc.api.objects.GethResult;
import com.jarbsc.api.util.HttpUtil;

public class Geth {
	
	
	public String getMostRecentEthBlockNumber() throws Exception {
		String endpoint = Endpoint.GethUrl.urlEthRecentBlockNumber();
		String result = HttpUtil.sendGet(endpoint);	
		Gson gson = new Gson();
		GethResult gethResult = gson.fromJson(result, GethResult.class);
		return gethResult.getResult();
	}
	
	public Block getBlockByNumber(String blockNumber) throws Exception {
		String endpoint = Endpoint.GethUrl.urlEthGetBlockByNumber(blockNumber);
		String result = HttpUtil.sendGet(endpoint);
		JsonElement jsonResult = JsonParser.parseString(result);
		String blockString = jsonResult.getAsJsonObject().get("result").toString();
		Gson gson = new Gson();
		return gson.fromJson(blockString, Block.class);
	}

}
