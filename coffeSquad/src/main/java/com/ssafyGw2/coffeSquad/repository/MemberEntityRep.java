package com.ssafyGw2.coffeSquad.repository;

import com.ssafyGw2.coffeSquad.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberEntityRep extends JpaRepository<Member, Long> {


}
