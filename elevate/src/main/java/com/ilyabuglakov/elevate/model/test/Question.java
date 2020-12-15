package com.ilyabuglakov.elevate.model.test;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Table(name = "question")
@Entity
public class Question {
    @Id
    @GeneratedValue
    private Long id;
    private String content;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private Set<Answer> answers;

    public boolean hasMultipleAnswers(){
        return answers.stream()
                .filter(Answer::isCorrect)
                .count() > 1;
    }

//    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name = "test_id", nullable = false)
//    private Test test;
}
