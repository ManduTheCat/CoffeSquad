package com.ssafyGw2.coffeSquad.repository;

import com.ssafyGw2.coffeSquad.domain.Squad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CoffeSquadEntityRep extends JpaRepository<Squad, Long> {

    @Query(value = "SELECT * FROM Squad WHERE Squad .squadOwner=:name", nativeQuery = true)
    public List<Squad> findSquadByName (String name);

}