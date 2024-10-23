package com.maska.service;


import com.maska.domain.entities.Member;
import com.maska.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;




    public Member createMember(Member member) {
        return memberRepository.save(member);
    }


    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }


    public Optional<Member> getMemberById(Long id) {
        return memberRepository.findById(id);
    }


    public Member updateMember(Long id, Member updatedMember) {
        return memberRepository.findById(id).map(member -> {
            member.setPrenom(updatedMember.getPrenom());
            member.setName(updatedMember.getName());
            member.setNumeroAdhesion(updatedMember.getNumeroAdhesion());
            member.setPieceIdentification(updatedMember.getPieceIdentification());
            member.setNationalite(updatedMember.getNationalite());
            member.setDateAdhesion(updatedMember.getDateAdhesion());
            member.setDateExpiration(updatedMember.getDateExpiration());
            return memberRepository.save(member);
        }).orElseThrow(() -> new RuntimeException("Member not found with id: " + id));
    }


    public boolean deleteMember(Long id) {
        return memberRepository.findById(id).map(member -> {
            memberRepository.delete(member);
            return true;
        }).orElse(false);
    }
}
