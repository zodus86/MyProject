package com.MyProject.MyProject.service.impl;


import com.MyProject.MyProject.dto.CounterpartyDto;
import com.MyProject.MyProject.model.Counterparty;
import com.MyProject.MyProject.repository.CounterpartyRepository;
import com.MyProject.MyProject.service.CounterpartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterpartyServiceImpl implements CounterpartyService {

    @Autowired
    private CounterpartyRepository counterpartyRepository;

    @Override
    public Counterparty findById(Long id) {
        return counterpartyRepository.findById(id).orElse(null);
    }

    @Override
    public void save(CounterpartyDto counterpartyDto) {
        Counterparty counterparty = new Counterparty();
        counterparty.setCounterpartyType(counterpartyDto.getCounterpartyType());
        counterparty.setName(counterpartyDto.getName());
        counterparty.setPhoneNumber(counterpartyDto.getPhoneNumber());
        counterpartyRepository.save(counterparty);
    }

    @Override
    public void delete(Long id) {
    counterpartyRepository.deleteById(id);
    }
}
