package br.com.studies.pic_pay_project.service;

import br.com.studies.pic_pay_project.model.TransferDestination;
import br.com.studies.pic_pay_project.model.TransferResponse;

public class TransferActionImpl {

     @Override
     public TransferResponse transfer(TransferDestination transferDestination) {
         // Logic for transferring money
          // pegar todos os dados do transferRequest, salvar no banco como uma nova transferencia
          repository.save(transferDestination);
          //futuramente evoluir para publicar em um tópico de mensageria
          TransferResponse response = new TransferResponse();
          response.setTransferRequest(transferDestination);
          // Se houver TransferOrigin, defina aqui: response.setTransferOrigin(origin);
          return response;

     }
}
