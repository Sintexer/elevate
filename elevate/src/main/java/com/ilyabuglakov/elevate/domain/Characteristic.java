package com.ilyabuglakov.elevate.domain;

import com.ilyabuglakov.elevate.model.authentication.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "characteristics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Characteristic {
    @Id
    @GeneratedValue
    private Long id;
    private int memory;

    @OneToOne(mappedBy = "characteristic")
    private User user;
}
