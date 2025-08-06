package br.com.studies.pic_pay_project.Controller;

import br.com.studies.pic_pay_project.model.TransferRequest;
import br.com.studies.pic_pay_project.model.TransferResponse;
import br.com.studies.pic_pay_project.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {

    @Autowired
    private TransferRepository repository;

    @PostMapping
    public ResponseEntity<TransferResponse> makeTransfer(@RequestBody TransferRequest transferRequest) {
        var transferOrigin = getTransferOrigin(); //método para obter os dados de quem está fazendo a transferência
        TransferResponse response = new TransferResponse();
        response.setTransferRequest(transferRequest);
        response.setTransferOrigin(transferOrigin); //get dados de quem está fazendo a transferência

        TransferResponse response = repository.save(response);
        return ResponseEntity.status(201).body(response);
    }
}
