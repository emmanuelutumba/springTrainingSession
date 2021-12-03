package com.trainingSessionJPA.springJPA.repository;

import com.trainingSessionJPA.springJPA.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    @Query("SELECT c FROM Country c join c.continent cont WHERE cont.id=:contId")
    public List<Country> findAllByContinent(@Param("contId") int contId);
}
