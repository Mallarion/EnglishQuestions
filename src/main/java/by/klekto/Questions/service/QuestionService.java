package by.klekto.Questions.service;


import by.klekto.Questions.domain.QuestionsList;
import by.klekto.Questions.repository.QuestionListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuestionService {

    @Autowired
    QuestionListRepository questionListRepository;


    public Long countQuestions(){
        return questionListRepository.countQuestionsListById(questionListRepository.findQuestionsListById(1L));


    }


}
