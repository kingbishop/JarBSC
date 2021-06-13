package com.jarbsc.api.objects;

import java.util.List;

public class Block {

	private String difficulty;
	private String extraData;
	private String gasLimit;
	private String gasUsed;
	private String hash;
	private String logsBloom;
	private String miner;
	private String mixHash;
	private String nonce;
	private String number;
	private String parentHash;
	private String receiptsRoot;
	private String sha3Uncles;
	private String size;
	private String stateRoot;
	private String timestamp;
	private String totalDifficulty;
	private List<Transaction> transactions;
	
	
	public String getDifficulty() {
		return difficulty;
	}
	public String getExtraData() {
		return extraData;
	}
	public String getGasLimit() {
		return gasLimit;
	}
	public String getGasUsed() {
		return gasUsed;
	}
	public String getHash() {
		return hash;
	}
	public String getLogsBloom() {
		return logsBloom;
	}
	public String getMiner() {
		return miner;
	}
	public String getMixHash() {
		return mixHash;
	}
	public String getNonce() {
		return nonce;
	}
	public String getNumber() {
		return number;
	}
	public String getParentHash() {
		return parentHash;
	}
	public String getReceiptsRoot() {
		return receiptsRoot;
	}
	public String getSha3Uncles() {
		return sha3Uncles;
	}
	public String getSize() {
		return size;
	}
	public String getStateRoot() {
		return stateRoot;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public String getTotalDifficulty() {
		return totalDifficulty;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	
	
}
