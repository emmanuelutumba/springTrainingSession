package com.trainingSessionJPA.springJPA.controller;

import com.trainingSessionJPA.springJPA.model.Continent;
import com.trainingSessionJPA.springJPA.model.Country;
import com.trainingSessionJPA.springJPA.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping(value = "/{continentId}")
    public ResponseEntity getCountries(@PathVariable("continentId") int continentId) {
        return ResponseEntity.ok(this.countryService.getList(new Continent(continentId)));
    }

    @PostMapping
    public ResponseEntity addCountry(@RequestBody Country country) {
        return ResponseEntity.ok(this.countryService.add(country));
    }
}
