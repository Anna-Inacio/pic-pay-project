package br.com.studies.pic_pay_project.model;

import br.com.studies.pic_pay_project.enums.DocumentType;
import jakarta.persistence.Embeddable;

@Embeddable
public class TransferDestination {
    private String beneficiaryName;
    private DocumentType document;
    private BankAccount bankAccount;
    private Long transferAmount;

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public DocumentType getDocument() {
        return document;
    }

    public void setDocument(DocumentType document) {
        this.document = document;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Long getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Long transferAmount) {
        this.transferAmount = transferAmount;
    }
}
