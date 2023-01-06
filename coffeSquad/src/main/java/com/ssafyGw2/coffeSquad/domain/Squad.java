package com.ssafyGw2.coffeSquad.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Squad {

    @Id @GeneratedValue
    private Long id;
    private String squadOwner;
    private String storeLink;
    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    private List<Member> memberList = new ArrayList<>();
    private String EndTime;


}
