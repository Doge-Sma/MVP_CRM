package com.crm.crm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.load.Load;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/load")
@AllArgsConstructor
public class LoadController {
    Load load;

    @GetMapping
    public void carregar(){
        load.carregar();

    }
    
}
