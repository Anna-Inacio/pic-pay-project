package br.com.studies.pic_pay_project.service;

import br.com.studies.pic_pay_project.model.BankAccount;

import java.util.Optional;

public interface BankDetailService {
    Long findBalanceByAccountNumberAndAccountNumberDigit(String accountNumber, long accountNumberDigit);

    Optional<BankAccount> findByAccountNumberAndAccountNumberDigit(String accountNumber, long accountNumberDigit);
}
