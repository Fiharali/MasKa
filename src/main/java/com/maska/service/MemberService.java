package com.maska.service;

import com.maska.domain.entities.Member;
import com.maska.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @PostConstruct
    public void insertStaticData() {
        Member member1 = new Member();
        member1.setId(1L);
        member1.setName("John Doe");

        Member member2 = new Member();
        member2.setId(2L);
        member2.setName("Jane Doe");

        memberRepository.save(member1);
        memberRepository.save(member2);
    }
}
