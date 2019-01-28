package com.event.management.event.service;

import com.event.management.event.model.User;
import com.event.management.event.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void validateAndSaveUser(User user) {
    if (user.getUsername() != null) {
      userRepository.save(user);
    }

  }
}
