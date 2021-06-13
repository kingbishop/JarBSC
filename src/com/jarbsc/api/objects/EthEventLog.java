package com.jarbsc.api.objects;

import java.util.List;

public class EthEventLog {

	private String address;
	private List<String> topics;
	private String data;
	private String blockNumber;
	private String timeStamp;
	private String gasPrice;
	private String gasUsed;
	private String logIndex;
	private String transactionHash;
	private String transactionIndex;
	
	public String getAddress() {
		return address;
	}
	public List<String> getTopics() {
		return topics;
	}
	public String getData() {
		return data;
	}
	public String getBlockNumber() {
		return blockNumber;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public String getGasPrice() {
		return gasPrice;
	}
	public String getGasUsed() {
		return gasUsed;
	}
	public String getLogIndex() {
		return logIndex;
	}
	public String getTransactionHash() {
		return transactionHash;
	}
	public String getTransactionIndex() {
		return transactionIndex;
	}
	
	
	
	
	
}
