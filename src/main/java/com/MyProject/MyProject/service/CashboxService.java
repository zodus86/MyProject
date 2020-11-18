package com.MyProject.MyProject.service;

import com.MyProject.MyProject.dto.CashboxDto;
import com.MyProject.MyProject.model.Cashbox;

public interface CashboxService {

    Cashbox findById(Long id);

    void deleteCashbox(Long id);

    void saveCashbox(CashboxDto cashbox);
}
