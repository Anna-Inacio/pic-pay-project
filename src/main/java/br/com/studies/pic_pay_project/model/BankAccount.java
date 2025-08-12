package br.com.studies.pic_pay_project.model;

import br.com.studies.pic_pay_project.enums.DocumentType;
import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class BankAccount {
    private UUID bankAccountId;
    private String holderName;
    private String accountNumber;
    private long accountNumberDigit;
    private DocumentType documentType;
    private Bank bankDetails;
    private Long balance;

    public UUID getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(UUID bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumberDigit() {
        return accountNumberDigit;
    }

    public void setAccountNumberDigit(long accountNumberDigit) {
        this.accountNumberDigit = accountNumberDigit;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Bank getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(Bank bankDetails) {
        this.bankDetails = bankDetails;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
