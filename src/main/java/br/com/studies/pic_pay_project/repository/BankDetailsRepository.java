package br.com.studies.pic_pay_project.repository;

import br.com.studies.pic_pay_project.model.BankDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankDetailsRepository extends JpaRepository<BankDetail, Long> {
}
