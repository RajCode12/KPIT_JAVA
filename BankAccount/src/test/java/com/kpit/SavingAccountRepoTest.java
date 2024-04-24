package com.kpit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.pojo.Customer;
import com.kpit.repo.SavingAccountRepo;

@SpringBootTest
public class SavingAccountRepoTest {
	@Autowired
	SavingAccountRepo savingRepo;
	
	@Test
	public void create() {
		Customer c = new Customer();
		c.setAccountNumber(102);
		c.setAccountHolder("DevKumar");
		c.setAccountBalance(10000f);
		savingRepo.save(c);
	}
	@Test
	public void read() {
		Customer c = null;
		c = 
		
		savingRepo.save(c);
	}
}
