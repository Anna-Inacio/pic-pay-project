package br.com.studies.pic_pay_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bank_details")
public class BankDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "agency", nullable = false)
    private Integer agency;

    @Column(name = "digit", nullable = false)
    private Integer digit;

    @Column(name = "account", nullable = false)
    private Integer account;

    @Column(name = "pix_key", nullable = false)
    private String pixKey;

    @Column(name = "bank_name", nullable = false)
    private String bankName;

    //TODO FK User

}
