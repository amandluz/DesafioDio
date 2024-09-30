package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public void freezeAccount(Long userId) {
        User user = findById(userId);
        if (user.getAccount() != null) {
            user.getAccount().setFrozen(true);
            userRepository.save(user);
        } else {
            throw new RuntimeException("User does not have an account");
        }
    }

    @Override
    public void unfreezeAccount(Long userId) {
        User user = findById(userId);
        if (user.getAccount() != null) {
            user.getAccount().setFrozen(false);
            userRepository.save(user);
        } else {
            throw new RuntimeException("User does not have an account");
        }
    }
}
