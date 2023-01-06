package com.ssafyGw2.coffeSquad.controller;

import com.ssafyGw2.coffeSquad.domain.Squad;
import com.ssafyGw2.coffeSquad.repository.CoffeSquadEntityRep;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@Slf4j
public class SquadController {
    @Autowired
    CoffeSquadEntityRep coffeSquadEntityRep;
    @GetMapping
    public Squad getSquad(){

        return null;
    }
    @PostMapping

    public Squad setSquad(@RequestBody Map<String, Object> formBody){
        Squad squad = new Squad();
        squad.setSquadOwner("김명진");
        squad.setCount("1");
        squad.setStoreLink("test.com");
        squad.setEndTime("16시");

        coffeSquadEntityRep.save(squad);
        return null;
    }

}
