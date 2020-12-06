package com.ilyabuglakov.elevate.model.authentication;

import com.ilyabuglakov.elevate.domain.Characteristic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String name;
    private String surname;
    private String password;

    private LocalDate registrationDate;

    @Enumerated(value = EnumType.STRING)
    private Role role = Role.USER;

    @Enumerated(value = EnumType.STRING)
    private Status status = Status.ACTIVE;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristic_id", referencedColumnName = "id")
    private Characteristic characteristic = new Characteristic();

    @PrePersist
    private void characteristics() {
        this.registrationDate = LocalDate.now();
    }
}
