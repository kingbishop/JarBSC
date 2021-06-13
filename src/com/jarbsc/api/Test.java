package com.jarbsc.api;

import com.jarbsc.api.accounts.Accounts;
import com.jarbsc.api.auth.BscAuth;
import com.jarbsc.api.objects.Block;
import com.jarbsc.api.objects.PriceInfo;
import com.jarbsc.api.tokens.Tokens;


public class Test {
	
	public static void main(String[] args) {
		BscAuth.setApiKey(System.getenv("APIKEY"));
		
		
		try {
			//tokens.getTotalSupply("0xb24434065fddcdd2f4b31d8cbd6f146119b37ee1");
			
			String totalCirculatingSupply = JarBsc.api.tokens().getTotalCirculatingSupply("0xb24434065fddcdd2f4b31d8cbd6f146119b37ee1");
			System.out.println(totalCirculatingSupply);
			
			Block block = JarBsc.api.geth().getBlockByNumber("0x3d0900");
			System.out.println(block.getNumber());
			block.getTransactions().forEach((tx)->{
				System.out.println(tx.getFrom());
			});
			
			PriceInfo bnbPrices = JarBsc.api.stats().getBnbLastPrice();
			
			System.out.println(bnbPrices.getUsd());
			
			JarBsc.api.logs().getEventLogsForAddress("0x6e0bef56b648b3eebae3808b8cbe7efe8755ad9c").forEach((log)->{
				System.out.println(log.getTransactionHash());
			});
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
