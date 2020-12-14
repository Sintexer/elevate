package com.ilyabuglakov.elevate.service;

import com.ilyabuglakov.elevate.model.test.Test;
import com.ilyabuglakov.elevate.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestService {

    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public boolean saveTest(Test test){
        if(testRepository.findByTestName(test.getTestName()).isPresent()){
            return false;
        }

        testRepository.save(test);
        return true;
    }

    public Optional<Test> getTest(Long testId){
        return testRepository.findById(testId);
    }
}
