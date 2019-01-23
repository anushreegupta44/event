package com.event.management.event.controller;

import com.event.management.event.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

  @PostMapping("/user")
  public ResponseEntity signUpUser(@RequestBody User user) {
    Map<String, String> status = new HashMap() {{
      put("status", "OK");
    }};
    return new ResponseEntity(status, HttpStatus.OK);

  }
}
