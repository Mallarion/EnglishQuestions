package by.klekto.Questions.repository;

import by.klekto.Questions.domain.QuestionsList;
import org.springframework.data.repository.CrudRepository;

public interface QuestionListRepository extends CrudRepository<QuestionsList, Long>  {
    Long countQuestionsListById(QuestionsList  questionsList);
    QuestionsList findQuestionsListById(Long quantity);
}
