package com.ilyabuglakov.elevate.repository;

import com.ilyabuglakov.elevate.model.authentication.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
