package com.ilyabuglakov.elevate.model.test;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "answer")
//@OneToMany(mappedBy = "answers")
public class Answer {
    @Id
    @GeneratedValue
    private Long id;
    private String content;
    private boolean correct;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name = "question_id", nullable = false)
//    private Question question;
}
