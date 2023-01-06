package com.ssafyGw2.coffeSquad.repository;

import com.ssafyGw2.coffeSquad.domain.Squad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoffeSquadEntityRep extends JpaRepository<Squad, Long> {

}