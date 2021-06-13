package com.jarbsc.api;

import com.jarbsc.api.accounts.Accounts;
import com.jarbsc.api.blocks.Blocks;
import com.jarbsc.api.contracts.Contracts;
import com.jarbsc.api.geth.Geth;
import com.jarbsc.api.logs.Logs;
import com.jarbsc.api.stats.Stats;
import com.jarbsc.api.tokens.Tokens;
import com.jarbsc.api.transactions.Transactions;

public class JarBsc {

	
	public static JarBsc api = new JarBsc();
	
	
	private Accounts accounts;
	private Blocks blocks;
	private Contracts contracts;
	private Geth geth;
	private Logs logs;
	private Stats stats;
	private Tokens tokens;
	private Transactions transactions;
	
	private JarBsc() {
		accounts = new Accounts();
		blocks = new Blocks();
		contracts = new Contracts();
		geth = new Geth();
		stats = new Stats();
		tokens = new Tokens();
		logs = new Logs();
		transactions = new Transactions();
	}
	
	public Accounts accounts() {
		return accounts;
	}
	
	public Blocks blocks() {
		return blocks;
	}
	
	public Contracts contracts() {
		return contracts;
	}
	
	public Geth geth() {
		return geth;
	}
	
	public Stats stats() {
		return stats;
	}
	
	public Tokens tokens() {
		return tokens;
	}
	
	public Logs logs() {
		return logs;
	}
	
	public Transactions transactions() {
		return transactions;
	}
	
}
