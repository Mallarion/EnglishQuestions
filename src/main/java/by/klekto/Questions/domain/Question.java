package by.klekto.Questions.domain;

import javax.persistence.*;


@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;



    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public QuestionsList getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(QuestionsList questionsList) {
        this.questionsList = questionsList;
    }

    @ManyToOne
    QuestionsList questionsList;
}
