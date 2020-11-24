package com.project.cashbox.service.impl;

import com.project.cashbox.dto.CashboxDto;
import com.project.cashbox.model.Cashbox;
import com.project.cashbox.repository.CashboxRepository;
import com.project.cashbox.service.CashboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashboxServiceImpl implements CashboxService {

    @Autowired
    private CashboxRepository cashboxRepository;


    @Override
    public Cashbox findById(Long id) {
        return cashboxRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        cashboxRepository.deleteById(id);
    }

    @Override
    public void save(CashboxDto cashboxDto) {
        Cashbox cashbox = new Cashbox();
        cashbox.setDate(cashboxDto.getDate());
        cashbox.setSum(cashboxDto.getSum());
        cashbox.setText(cashboxDto.getText());
        cashbox.setTypeOfOperation(cashboxDto.getTypeOfOperation());

        cashboxRepository.save(cashbox);
    }
}
