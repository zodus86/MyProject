package com.MyProject.MyProject.repository;

import com.MyProject.MyProject.model.Cashbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashboxRepository extends JpaRepository<Cashbox, Long> {
}
