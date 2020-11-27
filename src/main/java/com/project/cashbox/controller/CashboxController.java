package com.project.cashbox.controller;

import com.project.cashbox.dto.CashboxDto;
import com.project.cashbox.model.Cashbox;
import com.project.cashbox.service.CashboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import static org.apache.commons.lang3.ObjectUtils.isEmpty;

@RestController
@RequestMapping("/api/v1/cashbox")
public class CashboxController {

    @Autowired
    private CashboxService cashboxService;


    @PreAuthorize("hasAuthority('cashbox:read')")
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

    @PreAuthorize("hasAuthority('cashbox:write')")
    @PostMapping("/create")
    public ResponseEntity<String> addCashbox(@RequestBody CashboxDto cashboxDto){
        if(isEmpty(cashboxDto)){
            return ResponseEntity.badRequest().build();
        }

        cashboxService.save(cashboxDto);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PreAuthorize("hasAuthority('cashbox:write')")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        Cashbox cashbox = cashboxService.findById(id);

        if(isEmpty(cashboxService)){
            return ResponseEntity.notFound().build();
        }
        cashboxService.delete(id);
        return ResponseEntity.ok().build();
    }

}

