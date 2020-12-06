package com.ilyabuglakov.elevate.model.test;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "tests")
public class Test {
    @Id
    @GeneratedValue
    private Long id;
    private String testName;
    private Double difficulty;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "test")
    private Set<Question> questions;
}
