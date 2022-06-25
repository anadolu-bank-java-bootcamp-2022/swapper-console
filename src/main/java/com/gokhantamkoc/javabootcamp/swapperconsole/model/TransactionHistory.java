package com.gokhantamkoc.javabootcamp.swapperconsole.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// İşlem Tarihçesi
public class TransactionHistory {
	private List<Transaction> transactions;
	
	public TransactionHistory() {
		this.transactions = new ArrayList<Transaction>();
	}
	
	public List<Transaction> getTransactionByAskOwner(Owner owner) throws IOException {
		List<Transaction> filteredTransactions = new ArrayList<Transaction>();
		
		for (Transaction transaction : this.transactions) {
			if (transaction.getAsk().equals(owner)) {
				filteredTransactions.add(transaction);
			}
		}
		
		return filteredTransactions;
	}
	
	public List<Transaction> getTransactionByBidOwner(Owner owner) {
		List<Transaction> filteredTransactions = new ArrayList<Transaction>();
		
		for (Transaction transaction : this.transactions) {
			if (transaction.getBid().equals(owner)) {
				filteredTransactions.add(transaction);
			}
		}
		
		return filteredTransactions;
	}
}
