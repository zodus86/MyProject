package com.project.cashbox.service;

import com.project.cashbox.dto.CashboxDto;
import com.project.cashbox.model.Cashbox;

public interface CashboxService {

    Cashbox findById(Long id);
    void delete(Long id);
    void save(CashboxDto cashbox);

}
