package com.trainingSessionJPA.springJPA.service;

import com.trainingSessionJPA.springJPA.model.Continent;
import com.trainingSessionJPA.springJPA.model.Country;
import com.trainingSessionJPA.springJPA.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;


    @Override
    public List<Country> getList(Continent continent) {

        /*
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("continent.id", matcher -> {
                    matcher.exact();
                }).withIgnorePaths("id", "name");

        Country country = new Country();
        country.setContinent(continent);

        Example<Country> example = Example.of(country, exampleMatcher);
        return this.countryRepository.findAll(example);
         */

        return this.countryRepository.findAllByContinent(continent.getId());
    }

    @Override
    public Country add(Country country) {
        return this.countryRepository.save(country);
    }
}
