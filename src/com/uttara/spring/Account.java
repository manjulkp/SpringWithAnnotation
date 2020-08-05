package com.uttara.spring;

public interface Account {
	
	public void withDraw(double d);
	public void debit(double d);
	public double balanceQuery();

}
