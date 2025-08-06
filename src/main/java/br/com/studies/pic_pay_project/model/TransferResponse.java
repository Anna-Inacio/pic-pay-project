package br.com.studies.pic_pay_project.model;

public class TransferResponse {

    private TransferDestination transferDestination;
    private TransferOrigin transferOrigin;

    public TransferDestination getTransferRequest() {
        return transferDestination;
    }

    public void setTransferRequest(TransferDestination transferDestination) {
        this.transferDestination = transferDestination;
    }

    public TransferOrigin getTransferOrigin() {
        return transferOrigin;
    }

    public void setTransferOrigin(TransferOrigin transferOrigin) {
        this.transferOrigin = transferOrigin;
    }

}
