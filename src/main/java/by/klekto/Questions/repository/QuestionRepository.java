package by.klekto.Questions.repository;

import by.klekto.Questions.domain.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {

}
