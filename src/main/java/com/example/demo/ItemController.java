package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;
    private final HW1repository hw1repository;

    @GetMapping("/list")
    String list(Model model){
        List<Item> result = itemRepository.findAll();

        model.addAttribute("items", result);

        return "list.html";
    }

    @GetMapping("/hw1")
    String hw1(Model model){
        List<HW1> result2 = hw1repository.findAll();

        model.addAttribute("items2", result2);

        return "hw1.html";
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add")
    String addPost(@RequestParam Map formData){
        System.out.println(formData);

        return "redirect:/list";
    }
}
