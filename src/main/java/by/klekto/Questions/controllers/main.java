package by.klekto.Questions.controllers;


import by.klekto.Questions.repository.QuestionListRepository;
import by.klekto.Questions.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/questions")
public class main {

    @Autowired
    QuestionListRepository questionListRepository;

    @Autowired
    QuestionService questionService;

    @GetMapping("")
    public String askQuestions(Model model){
        Long quantity=questionService.countQuestions();
        model.addAttribute("quantity", quantity);
      return "main1";
    }


    /*@PostMapping("")
    public String ask(Model model){
        Long quantity=questionService.countQuestions();


    }*/
}
