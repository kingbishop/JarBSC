package com.jarbsc.api.endpoints;

import com.jarbsc.api.auth.BscAuth;

public class Endpoint {

	public static final String API = "https://api.bscscan.com/api";
	
	
	
	public static class AccountUrl {
		public static String urlGetBnbBalanceForAddress(String address) {
			String url = API + String.format("?module=account&action=balance&address=%s&tag=latest&apikey=%s",address,BscAuth.getApiKey());
			return url;
		}
	}
	
	public static class GethUrl {
		
		public static String urlEthRecentBlockNumber() {
			String url = String.format(API + "?module=proxy&action=eth_blockNumber&apikey=%s", BscAuth.getApiKey());
			return url;
		}
		
		public static String urlEthGetBlockByNumber(String blockNumber) {
			String url = String.format(API + "?module=proxy&action=eth_getBlockByNumber&tag=%s&boolean=true&apikey=%s",blockNumber,BscAuth.getApiKey());
			return url;
		}
		
		public static String urlGetBlockTransactionCountByNumber(String blockNumber) {
			String url = String.format(API + "?module=proxy&action=eth_getBlockTransactionCountByNumber&tag=%s&boolean=true&apikey=%s",blockNumber,BscAuth.getApiKey());
			return url;
		}
		
		public static String urlGetEthTransactionByHash(String txhash) {
			String url = String.format(API + "?module=proxy&action=eth_getTransactionByHash&txhash=%s&apikey=%s",txhash,BscAuth.getApiKey());
			return url;
		}
	}
	
	
	public static class ContractUrl {
		
		public static String urlGetVerifiedContractSourceCode(String contractAddress) {
			String url = API + String.format("?module=contract&action=getsourcecode&address=%s&apikey=%s",contractAddress,BscAuth.getApiKey());
			return url;
		}
		
	}
	
	public static class TokenUrl {
		
		public static String urlTotalSupplyByContractAddress(String contractAddress) {
			String url = API + String.format("?module=stats&action=tokensupply&contractaddress=%s&apikey=%s",contractAddress,BscAuth.getApiKey());
			return url;
		}
		
		public static String urlTotalCirculatingSupplyByContractAddress(String contractAddress) {
			String url = API + String.format("?module=stats&action=tokenCsupply&contractaddress=%s&apikey=%s",contractAddress,BscAuth.getApiKey());
			return url;
		}
		
		public static String urlTokenHolderListByContractAddress(String contractAddress,String apiKey,int page,int offset) {
			String url = API + String.format("?module=token&action=tokenholderlist&contractaddress=%s&page=%d&offset=%d&apikey=%s",contractAddress,page,offset,apiKey);
			return url;
		}
		
		public static String urlTokenInfoByContractAddress(String contractAddress) {
			String url = API + String.format("?module=token&action=tokeninfo&contractaddress=%s&apikey=%s",contractAddress,BscAuth.getApiKey());
			return url;
		}
	}
	
	public static class StatsUrl {
		
		public static String urlGetBnbLastPrice() {
			String url = API + String.format("?module=stats&action=bnbprice&apikey=%s",BscAuth.getApiKey());
			return url;
		}
		
	}
}
