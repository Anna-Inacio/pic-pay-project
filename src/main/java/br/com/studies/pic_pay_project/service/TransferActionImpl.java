package br.com.studies.pic_pay_project.service;

import br.com.studies.pic_pay_project.Controller.BankController;
import br.com.studies.pic_pay_project.model.TransferDestination;
import br.com.studies.pic_pay_project.model.TransferOrigin;
import br.com.studies.pic_pay_project.model.TransferResponse;
import br.com.studies.pic_pay_project.repository.BankDetailsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TransferActionImpl {
        private final BankDetailsRepository bankDetailsRepository;
        private final BankController bankController;

    public TransferActionImpl(BankDetailsRepository bankDetailsRepository,
                              BankController bankController) {
        this.bankDetailsRepository = bankDetailsRepository;
        this.bankController = bankController;
    }

    @Override
     public TransferResponse transfer(TransferDestination transferDestination) {
         //buscar na tabela de dados bancários de usuários o campo balance do remetente(conta de origem)
         var originAccount = new TransferOrigin();
         var balance = bankController.getBalance(
                 originAccount.getBankAccount().getAccountNumber(),
                 originAccount.getBankAccount().getAccountNumberDigit()
         );
         var balanceValue = balance.getBody();
         if (balanceValue >= transferDestination.getTransferAmount()) {
             //consultar autorizador de transferências
             //enviar o valor da transferência para a conta de destino (post na tabela de transferências)
             //se sucesso,
                //retornar 201 Created com os dados da transferência
                //atualizar o valor da transferência do balance do remetente
             var newBalance = balanceValue - transferDestination.getTransferAmount();
                bankController.updateBalance(
                        originAccount.getBankAccount().getAccountNumber(),
                        originAccount.getBankAccount().getAccountNumberDigit(),
                        newBalance
                );
             //se falhar,
                //retornar 500 Internal Server Error (erro customizado)
                // manter o balance do remetente (não atualizar o balance do remetente)
         } else {
             throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Balance less than the transfer amount");
         }
     }
}
