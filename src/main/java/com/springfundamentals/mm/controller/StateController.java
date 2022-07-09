package com.springfundamentals.mm.controller;

import com.springfundamentals.mm.respository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateRepository stateRepository;

}
