package br.com.studies.pic_pay_project.Controller;

import br.com.studies.pic_pay_project.model.BankAccount;
import br.com.studies.pic_pay_project.repository.BankDetailsRepository;
import br.com.studies.pic_pay_project.service.BankDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/bank")
public class BankController {
    private final BankDetailService bankDetailService;
    private final BankDetailsRepository repository;

    public BankController(BankDetailService bankDetailService, BankDetailsRepository repository) {
        this.bankDetailService = bankDetailService;
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<Long> getBalance(@RequestParam String accountNumber,
                                           @RequestParam long accountNumberDigit) {

        Long balance = bankDetailService.findBalanceByAccountNumberAndAccountNumberDigit(accountNumber, accountNumberDigit);
        if (balance == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found");
        }
        return ResponseEntity.ok(balance);
    }

    @PutMapping
    public ResponseEntity<BankAccount> updateBalance(@RequestParam String accountNumber,
                                                     @RequestParam long accountNumberDigit,
                                                     @RequestParam Long newBalance) {

        BankAccount bankDetails = bankDetailService.findByAccountNumberAndAccountNumberDigit(accountNumber, accountNumberDigit)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found"));
        bankDetails.setBalance(newBalance);
        BankAccount updated = repository.save(bankDetails);
        return ResponseEntity.ok(updated);
    }

}
