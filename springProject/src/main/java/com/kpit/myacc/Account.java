package com.kpit.myacc;

import org.springframework.stereotype.Component;

@Component("myAccs")
public class Account {
	public Account() {
		super();
		System.out.println("Account ctor....");
	}
	public void withdraw() {
		System.out.println("Withdrawing the money.....");
	}
}
