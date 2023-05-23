package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.entity.TestEntity;
import org.example.service.TestEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ThymeController {
    private final TestEntityService testEntityService;
    /*@GetMapping("/")
    public String getWebPage(){
        return "thIndex";
    }*/

    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("getAllEntities", testEntityService.getAll());
        return "thIndex";
    }
    @GetMapping("/getById")
    @ModelAttribute
    @ResponseBody
    public Optional<TestEntity> getTestEntityById(@RequestParam(value = "id", required = false) Long id){
        return testEntityService.getById(id);
    }

}
