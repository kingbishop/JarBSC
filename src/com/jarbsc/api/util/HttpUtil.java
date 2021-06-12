package com.jarbsc.api.util;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpUtil {

	public enum RequestType {
		POST,
		GET
	}
	
	private static final CloseableHttpClient httpClient = HttpClients.createDefault();
	
	
	public static String sendGet(String urlStr) throws Exception {
		String result = "";
		HttpGet request = new HttpGet(urlStr);
		
		CloseableHttpResponse response = httpClient.execute(request);
		HttpEntity entity = response.getEntity();
		
		if(entity != null) {
			result = EntityUtils.toString(entity);
		}
		return result;
	}
	
	private static void close() throws Exception {
		httpClient.close();
	}
	
}
