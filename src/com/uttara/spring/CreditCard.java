package com.uttara.spring;

import org.springframework.stereotype.Component;

@Component("cc")
public class CreditCard implements Account {

	
	public CreditCard()
	   {
		   System.out.println("The no arg of Credit Account is called ");
	   }
	String g;
	
	
	@Override
	public void withDraw(double d) {
		throw new UnsupportedOperationException();
		

	}

	@Override
	public void debit(double d) {
		// TODO Auto-generated method stub

	}

	@Override
	public double balanceQuery() {
		// TODO Auto-generated method stub
		return 0;
	}

}
