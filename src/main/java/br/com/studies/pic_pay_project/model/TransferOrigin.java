package br.com.studies.pic_pay_project.model;

import br.com.studies.pic_pay_project.enums.DocumentType;
import jakarta.persistence.Embeddable;

@Embeddable
public class TransferOrigin {
    private String originName;
    private DocumentType document;
    private BankAccount bankAccount;

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
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
}
