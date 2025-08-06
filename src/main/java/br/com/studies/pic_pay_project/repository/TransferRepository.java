package br.com.studies.pic_pay_project.repository;

import br.com.studies.pic_pay_project.model.TransferDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferDetail, Long> {
}
