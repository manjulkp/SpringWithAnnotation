package com.uttara.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankAccount implements Account {
	
	@Value("1000")
	private double balance;
	
	
	@Value("ACC783ew683")
	private String accountNum;
	
   public BankAccount()
   {
	   System.out.println("The no arg of Bank Account is called ");
   }
	

	@Override
public String toString() {
	return "BankAccount [balance=" + balance + ", accountNum=" + accountNum + "]";
}


	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((accountNum == null) ? 0 : accountNum.hashCode());
	long temp;
	temp = Double.doubleToLongBits(balance);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BankAccount other = (BankAccount) obj;
	if (accountNum == null) {
		if (other.accountNum != null)
			return false;
	} else if (!accountNum.equals(other.accountNum))
		return false;
	if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
		return false;
	return true;
}


	@Override
	public void withDraw(double d) {
		balance = balance-d;
	}

	@Override
	public void debit(double d) {
		balance = balance+d;

	}

	@Override
	public double balanceQuery() {
		
		return balance;
	}

}
