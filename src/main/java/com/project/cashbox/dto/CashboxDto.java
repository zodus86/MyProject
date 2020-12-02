package com.project.cashbox.dto;

import com.project.cashbox.model.TypeOfOperation;

import java.time.LocalDate;

public class CashboxDto {

    private LocalDate date;
    private Long sum;
    private String text;
    private TypeOfOperation typeOfOperation;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TypeOfOperation getTypeOfOperation() {
        return typeOfOperation;
    }

    public void setTypeOfOperation(TypeOfOperation typeOfOperation) {
        this.typeOfOperation = typeOfOperation;
    }
}
