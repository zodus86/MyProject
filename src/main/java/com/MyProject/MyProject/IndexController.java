package com.MyProject.MyProject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @GetMapping("/index")
    public ResponseEntity<String> viewIndex(){
        return new ResponseEntity<>("Index...",HttpStatus.OK);
    }
}
