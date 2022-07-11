package com.springfundamentals.mm.controller;

import com.springfundamentals.mm.model.Religion;
import com.springfundamentals.mm.respository.ReligionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/religion")
public class ReligionController {

    @Autowired
    private ReligionRepository religionRepository;

    @PostMapping("")
    public ResponseEntity<?> addReligionWithCaste(@RequestBody Religion religion) {
        Religion insertedReligionDetails;
        try{
            if (religionRepository.findByName(religion.getName()) != null) {
                return new ResponseEntity<>("Religion already available", HttpStatus.NOT_FOUND);
            }
            insertedReligionDetails = religionRepository.save(religion);

            if (insertedReligionDetails.getId() != null) {
                return new ResponseEntity<>(insertedReligionDetails, HttpStatus.OK);
            }
            return  new ResponseEntity<>("Religion Not Added", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Religion Not Added", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("")
    public ResponseEntity<?> getReligions() {
        return new ResponseEntity<>(religionRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/multi")
    public ResponseEntity<?> addMultipleReligion(@RequestBody List<Religion> religions) {
        List<Religion> uniqueReligions = religions.stream().filter(religionDetails -> {
            return religionRepository.findByName(religionDetails.getName()) == null;
        }).collect(Collectors.toList());
        System.out.println(religions);

        if (uniqueReligions.size() != 0) {
            return new ResponseEntity<>(religionRepository.saveAll(uniqueReligions), HttpStatus.OK);
        } else {
            return new ResponseEntity("All provided religions are available", HttpStatus.OK);
        }
    }
}
