package com.jarbsc.api;

import com.jarbsc.api.auth.BscAuth;
import com.jarbsc.api.tokens.Tokens;

public class Test {
	
	public static void main(String[] args) {
		BscAuth.setApiKey("P2F7SYARNFYACJRPJITPTF3QCEURPXZCUQ");
		
		Tokens tokens = new Tokens();
		try {
			tokens.getTotalSupply("0xb24434065fddcdd2f4b31d8cbd6f146119b37ee1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
