package br.com.studies.pic_pay_project.entity;

import br.com.studies.pic_pay_project.enums.TransferStatus;
import br.com.studies.pic_pay_project.enums.UserType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transfer_details")
public class TransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "destination", nullable = false)
    private String destination;

    @Column(name = "origin", nullable = false)
    private String origin;

    @Column(name = "user_type", nullable = false)
    private UserType userType;

    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "transfer_status", nullable = false)
    private TransferStatus transferStatus;

}
