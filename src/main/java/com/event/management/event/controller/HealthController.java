package com.event.management.event.controller;

import com.event.management.event.dto.HealthDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {


  @GetMapping(value = "/status")
  public ResponseEntity status() {
    Map<String, String> status = new HashMap() {{
      put("status", "OK");
    }};

    return new ResponseEntity(status, HttpStatus.OK);
  }

}
