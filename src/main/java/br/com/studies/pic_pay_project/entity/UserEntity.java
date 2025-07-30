package br.com.studies.pic_pay_project.entity;

import br.com.studies.pic_pay_project.model.BankDetails;
import jakarta.persistence.*;

@Entity
@Table(name = "user");
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "document_type", nullable = false)
    private DocumentType documentType; //TODO CPF(regras de CPF), CNPJ(regras de CNPJ)

    @Column(name = "document_number", nullable = false, unique = true)
    private String documentNumber;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "bank_details", nullable = false)
    private BankDetails bankDetails; //TODO metada?
}
