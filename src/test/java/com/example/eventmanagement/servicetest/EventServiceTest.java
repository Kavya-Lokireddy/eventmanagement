package com.example.eventmanagement.servicetest;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.service.EventService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventServiceTest {

	@Autowired
	private EventService eventService;

	@Test
	void testCreateEventUsingMySQL() {
		// Arrange
		Event event = new Event();
		event.setName("JUnit MySQL Event");
		event.setLocation("Test Location");
		event.setDate(LocalDate.now());
		event.setDescription("JUnit test using MySQL database");

		// Act
		Event savedEvent = eventService.createEvent(event);

		// Assert
		assertNotNull(savedEvent);
		assertNotNull(savedEvent.getId());
		assertEquals("JUnit MySQL Event", savedEvent.getName());
	}
}
