package com.MyProject.MyProject.service.impl;

import com.MyProject.MyProject.dto.CashboxDto;
import com.MyProject.MyProject.model.Cashbox;
import com.MyProject.MyProject.repository.CashboxRepository;
import com.MyProject.MyProject.service.CashboxService;
import com.MyProject.MyProject.service.CounterpartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashboxServiceImpl implements CashboxService {


   @Autowired
   private CashboxRepository cashboxRepository;

   @Autowired
   private CounterpartyService counterpartyService;

    @Override
    public Cashbox findById(Long id) {
        return cashboxRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCashbox(Long id) {
        cashboxRepository.deleteById(id);
    }

    @Override
    public void saveCashbox(CashboxDto cashboxDto) {
        Cashbox cashbox = new Cashbox();
        cashbox.setCost(cashboxDto.getCost());
        cashbox.setCounterparty(counterpartyService.findById(cashboxDto.getCounterpartyId()));
        cashbox.setDate(cashboxDto.getDate());
        cashbox.setText(cashboxDto.getText());
    }





}
