package br.com.studies.pic_pay_project.service;

import br.com.studies.pic_pay_project.model.TransferResponse;

public interface TransferActions {
    TransferResponse transfer(String fromAccount, String toAccount, double amount);
}
