package com.example.demo.services;

import com.example.demo.domains.Account;
import com.example.demo.repositorys.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServices {

    @Autowired
    private AccountRepository accountRepository;
    // create the account
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    // get the list of account
    public Iterable<Account> getAllAccounts()
    {
      return accountRepository.findAll();
    }
    // show single account
    public Account getAccountById(String idString) {

        // converting String to Long
        Long idLong = Long.valueOf(idString);

        Optional<Account> accountById = accountRepository.findById(idLong);

        return accountById.orElse(null);
    }
}
