package com.MyProject.MyProject.controller;

import com.MyProject.MyProject.dto.CashboxDto;
import com.MyProject.MyProject.model.Cashbox;
import com.MyProject.MyProject.model.Counterparty;
import com.MyProject.MyProject.service.CashboxService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.apache.commons.lang3.ObjectUtils.isEmpty;

@RestController
@RequestMapping("/api/v1/cashbox")
public class CashboxController {

    private CashboxService cashboxService;

    @GetMapping("/{id}")
    public ResponseEntity<Cashbox> finById(@PathVariable("id") Long id){
        if (isEmpty(id)){
            return ResponseEntity.badRequest().build();
        }
        Cashbox cashbox = cashboxService.findById(id);

        if(isEmpty(cashbox)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(cashbox);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addCashbox(@RequestBody CashboxDto cashboxDto){
        if(isEmpty(cashboxDto)){
            return ResponseEntity.badRequest().build();
        }

        cashboxService.saveCashbox(cashboxDto);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        Cashbox cashbox = cashboxService.findById(id);

        if(isEmpty(cashboxService)){
            return ResponseEntity.notFound().build();
        }
        cashboxService.deleteCashbox(id);
        return ResponseEntity.ok().build();
    }

}
