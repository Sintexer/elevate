package com.ilyabuglakov.elevate.domain.type;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public enum CharacteristicType {
    MEMORY,
    REACTION,
    LOGIC,
    CALCULATIONS;
}
