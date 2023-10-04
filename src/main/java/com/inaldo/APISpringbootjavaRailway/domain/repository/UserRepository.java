package com.inaldo.APISpringbootjavaRailway.domain.repository;

import com.inaldo.APISpringbootjavaRailway.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
