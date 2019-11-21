package com.spk.rest.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

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
public class SpkRestDemoD1AppTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private UserService userService;

	@Test
	public void testIndexPage() {

		ResponseEntity<String> response = testRestTemplate.getForEntity("/users", String.class);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).contains("Aaa");
	}

	@Test
	public void testDeleteAudience() {
		User user = userService.find(101).get();
		userService.deleteById(101);

		List<User> all = userService.findAll();

		assertThat(all).doesNotContain(user);
	}

	@Test
	public void testAddAudience() {

		User user = new User(1001, "Mr Tester Boss", LocalDate.of(2015, 9, 9), "boos@test.com", "987654321");

		userService.add(user);

		assertThat(userService.findAll()).contains(user);

	}
}
