package com.ilyabuglakov.elevate.repository;

import com.ilyabuglakov.elevate.model.test.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TestRepository extends CrudRepository<Test, Long> {
    Optional<Test> findByTestName(String string);

    List<Test> findAll();
}
