package com.ilyabuglakov.elevate.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private long id;
    private String name;
    private String surname;
}
