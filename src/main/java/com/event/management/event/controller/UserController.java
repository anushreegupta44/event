package com.event.management.event.controller;

import com.event.management.event.model.User;
import com.event.management.event.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {


  UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/user")
  public ResponseEntity signUpUser(@RequestBody User user) {
    userService.validateAndSaveUser(user);
    Map<String, String> status = new HashMap() {{
      put("status", "OK");
    }};
    return new ResponseEntity(status, HttpStatus.OK);

  }
}
