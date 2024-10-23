package com.maska.controller;

import com.maska.repository.MemberRepository;
import com.maska.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {




    @GetMapping("/members")
    public String getMembers(Model model) {

        model.addAttribute("message", "List of members");
        return "members";
    }
}
