package br.com.studies.pic_pay_project.model;

public class User {
    private Long id;
    private String name;
    private DocumentType documentType; //TODO CPF, CNPJ
    private String documentNumber;
    private String email;
    private String password;
    private BankDetails bankDetails;
}
