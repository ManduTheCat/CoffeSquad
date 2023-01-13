package com.ssafyGw2.coffeSquad.controller;

import com.ssafyGw2.coffeSquad.domain.Squad;
import com.ssafyGw2.coffeSquad.repository.CoffeSquadEntityRep;
import com.ssafyGw2.coffeSquad.repository.MemberEntityRep;
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
    @Autowired
    MemberEntityRep memberEntityRep;
    @GetMapping
    public List<Squad> getSquad(){
        List<Squad> findALl = coffeSquadEntityRep.findAll();
        for(Squad squad : findALl){
            log.info(squad.getSquadOwner());
        }
        return findALl;
    }

//     맴버를 스쿼드를 추가 하려며 어디스쿼드에 추가 해야얗지
    //등록하는거 한번에
    // 멤버가 속한 스쿼드를 반환해준다
    @GetMapping("/memberId/{name}")
    public String getSquardIdByOwnerName(@PathVariable("name") String name) throws Exception {
        log.info("input id {}",name);
        coffeSquadEntityRep.findSquadByName(name);
        return null;
    }
    @PostMapping("/addOrder")
    public Squad setSquad(@RequestParam Map<String, Object> formBody){
        log.info("input {}",(String) formBody.get("squadOwner"));
        log.info("input {}",(String) formBody.get("storeLink"));
        log.info("input {}",(String) formBody.get("EndTime"));
        Squad squad = new Squad();
        squad.setSquadOwner((String)formBody.get("squadOwner"));
        squad.setStoreLink((String)formBody.get("storeLink"));
        squad.setEndTime((String)formBody.get("EndTime"));

        coffeSquadEntityRep.save(squad);
        return squad;
    }

}
