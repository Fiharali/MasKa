package com.maska.service;

import com.maska.domain.entities.Member;
import com.maska.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @PostConstruct
    public void insertStaticData() {

        if (memberRepository.count() == 0) {
            Member member1 = createSampleMember(
                    "M001",
                    "John",
                    "Doe",
                    "PP123456",
                    "American",
                    new Date()
            );

            Member member2 = createSampleMember(
                    "M002",
                    "Jane",
                    "Doe",
                    "PP789012",
                    "Canadian",
                    new Date()
            );

            memberRepository.save(member1);
            memberRepository.save(member2);
        }
    }

    private Member createSampleMember(String numeroAdhesion, String name, String prenom,
                                      String pieceIdentification, String nationalite, Date dateAdhesion) {
        Member member = new Member();
        member.setNumeroAdhesion(numeroAdhesion);
        member.setName(name);
        member.setPrenom(prenom);
        member.setPieceIdentification(pieceIdentification);
        member.setNationalite(nationalite);
        member.setDateAdhesion(dateAdhesion);

        // Set expiration date to one year after adhesion date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateAdhesion);
        calendar.add(Calendar.YEAR, 1);
        member.setDateExpiration(calendar.getTime());

        return member;
    }

    @Transactional
    public Member createMember(Member member) {
        if (member.getDateAdhesion() == null) {
            member.setDateAdhesion(new Date());
        }

        // Set expiration date to one year after adhesion date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(member.getDateAdhesion());
        calendar.add(Calendar.YEAR, 1);
        member.setDateExpiration(calendar.getTime());

        return memberRepository.save(member);
    }

    @Transactional(readOnly = true)
    public Optional<Member> getMemberById(Long id) {
        return memberRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Member> getAllMembers() {
        return (List<Member>) memberRepository.findAll();
    }

    @Transactional
    public Member updateMember(Long id, Member memberDetails) {
        return memberRepository.findById(id)
                .map(existingMember -> {
                    existingMember.setName(memberDetails.getName());
                    existingMember.setPrenom(memberDetails.getPrenom());
                    existingMember.setPieceIdentification(memberDetails.getPieceIdentification());
                    existingMember.setNationalite(memberDetails.getNationalite());
                    // Don't update numeroAdhesion as it should be immutable
                    return memberRepository.save(existingMember);
                })
                .orElseThrow(() -> new RuntimeException("Member not found with id: " + id));
    }

    @Transactional
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public boolean isMembershipExpired(Long id) {
        return memberRepository.findById(id)
                .map(member -> member.getDateExpiration().before(new Date()))
                .orElseThrow(() -> new RuntimeException("Member not found with id: " + id));
    }

    @Transactional
    public Member renewMembership(Long id) {
        return memberRepository.findById(id)
                .map(member -> {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date());
                    calendar.add(Calendar.YEAR, 1);
                    member.setDateExpiration(calendar.getTime());
                    return memberRepository.save(member);
                })
                .orElseThrow(() -> new RuntimeException("Member not found with id: " + id));
    }
}