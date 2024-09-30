package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
    void freezeAccount(Long userId);
    void unfreezeAccount(Long userId);
    
}

