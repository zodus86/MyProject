package com.MyProject.MyProject.controller;

import com.MyProject.MyProject.dto.CounterpartyDto;
import com.MyProject.MyProject.model.Counterparty;
import com.MyProject.MyProject.service.CounterpartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.commons.lang3.ObjectUtils.isEmpty;

@RestController
@RequestMapping("/api/v1/counterparty")
public class CounterpartyController {

    @Autowired
    private CounterpartyService counterpartyService;

    @GetMapping("/{id}")
    public ResponseEntity<Counterparty> findById(@PathVariable("id") Long id){
        if (isEmpty(id)){
            return ResponseEntity.badRequest().build();
        }
        Counterparty counterparty = counterpartyService.findById(id);

        if(isEmpty(counterparty)){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(counterparty);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addCounterparty(@RequestBody CounterpartyDto counterpartyDto){
        if(isEmpty(counterpartyDto)){
            return ResponseEntity.badRequest().build();
        }
        counterpartyService.save(counterpartyDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        Counterparty counterparty = counterpartyService.findById(id);

        if(isEmpty(counterparty)){
            return ResponseEntity.notFound().build();
        }
        counterpartyService.delete(id);
        return ResponseEntity.ok().build();
    }
}
