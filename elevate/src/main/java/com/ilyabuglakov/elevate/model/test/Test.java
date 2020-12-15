package com.ilyabuglakov.elevate.model.test;

import com.ilyabuglakov.elevate.domain.type.CharacteristicType;
import lombok.Data;
import org.hibernate.annotations.CollectionType;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue
    private Long id;
    private String testName;
    private Double difficulty;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "test_id")
    private Set<Question> questions;

    @ElementCollection(targetClass = CharacteristicType.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "test_id", referencedColumnName = "id")
    @Column(name = "characteristic", nullable = false)
    @Enumerated(EnumType.STRING)
    private Set<CharacteristicType> characteristics;
}
