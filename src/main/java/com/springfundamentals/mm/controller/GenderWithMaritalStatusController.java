package com.springfundamentals.mm.controller;

import com.springfundamentals.mm.model.GenderWithMaritalStatus;
import com.springfundamentals.mm.respository.GenderWithMaritalStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gender-with-marital-status")
public class GenderWithMaritalStatusController {

    @Autowired
    GenderWithMaritalStatusRepository genderWithMaritalStatusRepository;

    @GetMapping("")
    public ResponseEntity<?> getAllGenderWithMaritalStatus() {
        return new ResponseEntity<>(genderWithMaritalStatusRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> addGenderWithMaritalStatus(@RequestBody GenderWithMaritalStatus genderWithMaritalStatus) {
        return new ResponseEntity<>(genderWithMaritalStatusRepository.save(genderWithMaritalStatus), HttpStatus.OK);
    }
}
