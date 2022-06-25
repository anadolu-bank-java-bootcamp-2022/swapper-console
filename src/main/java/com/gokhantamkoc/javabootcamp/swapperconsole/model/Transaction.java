package com.gokhantamkoc.javabootcamp.swapperconsole.model;

import java.io.IOException;

// İşlem
public class Transaction {
	private Order askOrder;
	private Order bidOrder;
	private Owner ask;
	private Owner bid;
	
	public Order getAskOrder() {
		return askOrder;
	}
	
	public void setAskOrder(Order askOrder) {
		this.askOrder = askOrder;
	}
	public Order getBidOrder() {
		return bidOrder;
	}
	public void setBidOrder(Order bidOrder) {
		this.bidOrder = bidOrder;
	}
	public Owner getAsk() {
		return ask;
	}
	public void setAsk(Owner ask) {
		this.ask = ask;
	}
	public Owner getBid() {
		return bid;
	}
	public void setBid(Owner bid) {
		this.bid = bid;
	}
}
