package br.com.studies.pic_pay_project.model;

import br.com.studies.pic_pay_project.enums.TransferStatus;
import br.com.studies.pic_pay_project.enums.UserType;

import java.time.LocalDateTime;

public class TransferDetails {
    private Long id;
    private String destination;
    private String origin;
    private UserType userType;
    private LocalDateTime dateTime;
    private TransferStatus transferStatus;
}
