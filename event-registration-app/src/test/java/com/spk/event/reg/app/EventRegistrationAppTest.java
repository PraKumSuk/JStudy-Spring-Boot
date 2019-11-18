package com.spk.event.reg.app;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class EventRegistrationAppTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private AudienceService audienceService;

	@Test
	public void testIndexPage() {

		ResponseEntity<String> response = testRestTemplate.getForEntity("/", String.class);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).contains("Praveen");
	}

	@Test
	public void testDeleteAudience() {
		
	}

	@Test
	public void testAddAudience() {

		Audience audience = new Audience("Mr Tester Boss", "boos@test.com", LocalDate.of(2015, 9, 9), "987654321");

		audienceService.add(audience);	

		assertThat(audienceService.findAll()).contains(audience);

	}
}
