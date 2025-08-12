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
    //buscar na tabela de dados bancários de usuários o campo balance do remetente(conta de origem)
        //se o balance for menor que o valor da transferência, retornar erro 400 Bad Request
        //se não, continuar com a transferência
            //consultar autorizador de transferências
            //enviar o valor da transferência para a conta de destino
                //se sucesso,
                    //retornar 201 Created com os dados da transferência
                    //atualizar o valor da transferência do balance do remetente
                //se falhar,
                    //retornar 500 Internal Server Error (erro customizado)
                    // manter o balance do remetente (não atualizar o balance do remetente)
}
