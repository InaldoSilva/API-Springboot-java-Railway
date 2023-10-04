package com.inaldo.APISpringbootjavaRailway.service;

import com.inaldo.APISpringbootjavaRailway.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
