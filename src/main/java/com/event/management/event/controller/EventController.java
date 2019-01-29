package com.event.management.event.controller;

import com.event.management.event.dto.EventDto;
import com.event.management.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EventController {

  @Autowired
  EventService eventService;

  @PostMapping(value = "/event")
  public ResponseEntity createEvent(@RequestBody EventDto eventDto) {
    eventService.save(eventDto);
    return new ResponseEntity(HttpStatus.OK);
  }
}

