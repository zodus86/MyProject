package com.MyProject.MyProject.service;

import com.MyProject.MyProject.dto.CounterpartyDto;
import com.MyProject.MyProject.model.Counterparty;

public interface CounterpartyService {

    Counterparty findById(Long id);

    void save(CounterpartyDto counterpartyDto);
    void delete(Long id);

}
