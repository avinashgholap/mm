package com.springfundamentals.mm.controller;

import com.springfundamentals.mm.model.APIResponse;
import com.springfundamentals.mm.model.Country;
import com.springfundamentals.mm.respository.CountryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryRespository countryRespository;

    @GetMapping("")
    public ResponseEntity<?> getCountries() {
        List<Country> countries = countryRespository.findAll();
        ResponseEntity response;
        if (countries.size() > 0) {
            return new ResponseEntity<List<Country>>(countries, HttpStatus.OK);
        } else {
            return new ResponseEntity("No Countries found", HttpStatus.NOT_FOUND);
        }
    }

//    @PostMapping("")
//    public ResponseEntity<?> addCountry() {
//
//    }
}
