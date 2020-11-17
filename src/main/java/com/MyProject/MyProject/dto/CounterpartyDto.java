package com.MyProject.MyProject.dto;

import com.MyProject.MyProject.model.CounterpartyType;

public class CounterpartyDto {
    private String name;
    private String phoneNumber;
    private CounterpartyType counterpartyType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CounterpartyType getCounterpartyType() {
        return counterpartyType;
    }

    public void setCounterpartyType(CounterpartyType counterpartyType) {
        this.counterpartyType = counterpartyType;
    }
}
