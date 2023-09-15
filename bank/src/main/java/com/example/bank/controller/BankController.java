package com.example.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Bank;
import com.example.bank.repo.BankRepo;

@RestController
public class BankController {

	@Autowired
	BankRepo bankRepo;

	@PostMapping("/saveBank")
	public Bank saveBank(@RequestBody Bank bank) {
		return bankRepo.save(bank);
	}
}
