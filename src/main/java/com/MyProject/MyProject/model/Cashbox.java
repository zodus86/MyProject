package com.MyProject.MyProject.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cashbox {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name ="cost")
    private Integer cost;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "counterparty_id", referencedColumnName = "id")
    private Counterparty counterparty;

    @Column(name = "text")
    private String text;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Counterparty getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
    }


}
