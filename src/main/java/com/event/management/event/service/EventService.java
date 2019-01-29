package com.event.management.event.service;

import com.event.management.event.dto.EventDto;
import com.event.management.event.model.Event;
import com.event.management.event.model.User;
import com.event.management.event.repository.EventRepository;
import com.event.management.event.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  EventRepository eventRepository;

  public void save(EventDto eventDto) {
    Event event = new Event(eventDto.getName(), eventDto.getDescription());
    String userId = eventDto.getUserId();
    User user = userRepository.getOne(userId);
    event.setCreatedBy(user);
    eventRepository.save(event);

  }
}
