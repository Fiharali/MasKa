package com.maska.test;


import com.maska.domain.entities.Member;
import com.maska.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

           ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
            Member member = new Member();
            member.setPrenom("John1");
            member.setName("Doe1");
            member.setNumeroAdhesion("11122");
            member.setPieceIdentification("11211");
            member.setNationalite("USA");
            member.setDateAdhesion(new java.util.Date());
            member.setDateExpiration(new java.util.Date());

                MemberService memberService = context.getBean(MemberService.class);
                //memberService.createMember(member);
               // memberService.getAllMembers().forEach(System.out::println);
                //memberService.getMemberById(8L).ifPresent(System.out::println);
            //memberService.updateMember(8L, member);
                memberService.deleteMember(8L);

                System.out.println("successfully!");


    }
}
