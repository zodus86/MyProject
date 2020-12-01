package com.project.cashbox.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Cashbox {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "sum")
    private Double sum;

    @Column(name = "text")
    private String text;

    @Column(name = "type_of_operation")
    @Enumerated(EnumType.STRING)
    private TypeOfOperation typeOfOperation;

}
