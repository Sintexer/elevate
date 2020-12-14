package com.ilyabuglakov.elevate.model.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAnswersDTO {

    private long testId;

    private Set<Long> answerIdSet;

}
