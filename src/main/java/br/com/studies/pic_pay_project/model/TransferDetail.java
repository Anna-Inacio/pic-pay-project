package br.com.studies.pic_pay_project.model;

import br.com.studies.pic_pay_project.enums.TransferStatus;
import br.com.studies.pic_pay_project.enums.UserType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TRANSFER_DETAILS")
public class TransferDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    public TransferDestination getDestination() {
        return destination;
    }

    public void setDestination(TransferDestination destination) {
        this.destination = destination;
    }

    public TransferOrigin getOrigin() {
        return origin;
    }

    public void setOrigin(TransferOrigin origin) {
        this.origin = origin;
    }

    private TransferDestination destination;
    private TransferOrigin origin;
    private UserType userType;
    private LocalDateTime dateTime;
    private TransferStatus transferStatus;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }
}
