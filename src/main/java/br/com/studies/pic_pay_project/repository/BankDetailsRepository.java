package br.com.studies.pic_pay_project.repository;

import br.com.studies.pic_pay_project.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankDetailsRepository extends JpaRepository<Bank, Long> {}
