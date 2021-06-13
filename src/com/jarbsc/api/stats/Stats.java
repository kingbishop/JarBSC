package com.jarbsc.api.stats;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.jarbsc.api.endpoints.Endpoint;
import com.jarbsc.api.objects.PriceInfo;
import com.jarbsc.api.util.HttpUtil;

public class Stats {

	public PriceInfo getBnbLastPrice() throws Exception {
		String endpoint = Endpoint.StatsUrl.urlGetBnbLastPrice();
		String result = HttpUtil.sendGet(endpoint);	
		JsonElement jsonResult = JsonParser.parseString(result);
		String resultString = jsonResult.getAsJsonObject().get("result").toString();
		Gson gson = new Gson();
		return gson.fromJson(resultString, PriceInfo.class);
	}
	
}
