package com.example.demo.controllers;

import com.example.demo.domains.Account;
import com.example.demo.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountServices accountService;

    @PostMapping(value = "/create", produces = "application/json")
    public Account createAccount(@RequestBody Account accountRequest) {
        return accountService.createAccount(accountRequest);
    }

    @GetMapping("/list")
    public Iterable<Account>  getAllAccounts()
    {
        return accountService.getAllAccounts();
    }

    @GetMapping("/show/{id}")
    public Account getAccountById(@PathVariable("id") String id)
    {
      return  accountService.getAccountById(id);

    }

}
