package br.com.studies.pic_pay_project.model;

import br.com.studies.pic_pay_project.enums.AccountType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "BANK")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String bankName;
    private long bankNumber;
    private Integer agencyNumber;
    private AccountType accountType;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(long bankNumber) {
        this.bankNumber = bankNumber;
    }

    public Integer getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(Integer agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
