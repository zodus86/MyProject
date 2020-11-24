package com.project.cashbox.repository;

import com.project.cashbox.model.Cashbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashboxRepository extends JpaRepository<Cashbox,Long> {

}
