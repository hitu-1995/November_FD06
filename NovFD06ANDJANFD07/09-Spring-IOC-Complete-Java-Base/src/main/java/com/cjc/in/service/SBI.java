package com.cjc.in.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjc.in.model.Account;

@Component(value = "sbi")
public class SBI {

	Scanner sc = new Scanner(System.in);
    
	@Autowired
	private Account account;

	public void createAccount() {
	
		System.out.println("Enter Account Number ");
	    account.setAcno(sc.nextInt());
	    System.out.println("Enter Account Name");
	    account.setAcname(sc.next());
	    System.out.println("Enter Balance ");
	    account.setBalance(sc.nextDouble());
	}
	
	public void viewDetails() {
		System.out.println(account);
	}
}
