package com.ssafyGw2.coffeSquad.controller;

import com.ssafyGw2.coffeSquad.domain.Squad;
import com.ssafyGw2.coffeSquad.repository.CoffeSquadEntityRep;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@Slf4j
public class SquadController {
    @Autowired
    CoffeSquadEntityRep coffeSquadEntityRep;
    @GetMapping
    public List<Squad> getSquad(){
        List<Squad> findALl = coffeSquadEntityRep.findAll();
        return findALl;
    }
    @PostMapping

    public Squad setSquad(@RequestParam Map<String, Object> formBody){
        log.info((String) formBody.get("setSquadOwner"));
        Squad squad = new Squad();
        squad.setSquadOwner("김명진");
        squad.setCount("1");
        squad.setStoreLink("test.com");
        squad.setEndTime("16시");

        coffeSquadEntityRep.save(squad);
        return squad;
    }

}
