package org.launchcode.javawebdevtechjobspersistent.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("skills")
public class SkillController {


    @Autowired
    private SkillRepository skillRepository;

    @GetMapping
    public String skillsViewAll(Model model) {
        model.addAttribute("title", "All Skills");
        model.addAttribute("skill", skillRepository.findAll());
        return "skills/index";
    }
}