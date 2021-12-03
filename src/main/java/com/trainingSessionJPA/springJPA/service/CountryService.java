package com.trainingSessionJPA.springJPA.service;


import com.trainingSessionJPA.springJPA.model.Continent;
import com.trainingSessionJPA.springJPA.model.Country;
import com.trainingSessionJPA.springJPA.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CountryService {
    public List<Country> getList(Continent continent);

    public Country add(Country country);
}
