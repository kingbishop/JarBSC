package com.jarbsc.api.logs;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.jarbsc.api.endpoints.Endpoint;
import com.jarbsc.api.objects.EthEventLog;
import com.jarbsc.api.util.HttpUtil;

public class Logs {

	

	public List<EthEventLog> getEventLogsForAddress(String address) throws Exception {
		String endpoint = Endpoint.LogUrl.urlGetAllEventLogsForAddress(address);
		String result = HttpUtil.sendGet(endpoint);
		JsonElement jsonResult = JsonParser.parseString(result);
		String resultString = jsonResult.getAsJsonObject().get("result").toString();
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<EthEventLog>>(){}.getType();
		return gson.fromJson(resultString, collectionType);
	}
	
	
}
