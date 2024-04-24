package com.kpit.pojo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="cutomer_tbl")
public class Customer {
	@Id
	@Column(name="accNo")
	private int accountNumber;
	
	@Column(name="accName")
	private String accountHolder;
	
	@Column(name="accBal")
	private float accountBalance;
	
	public Customer() {
		super();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Customer [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
}
