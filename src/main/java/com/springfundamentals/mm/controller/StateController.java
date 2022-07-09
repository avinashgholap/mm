package com.springfundamentals.mm.controller;

import com.springfundamentals.mm.model.Country;
import com.springfundamentals.mm.model.State;
import com.springfundamentals.mm.respository.CountryRespository;
import com.springfundamentals.mm.respository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CountryRespository countryRespository;
}
