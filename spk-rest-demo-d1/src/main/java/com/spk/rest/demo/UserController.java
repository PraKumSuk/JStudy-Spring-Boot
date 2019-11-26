package com.spk.rest.demo;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> findAllUsers() {
		
		logger.info("Invoked findAllUsers Service");
		logger.debug("Fetching all users");
		return userService.findAll();
	}

	@PostMapping("/add")
	public User add(@RequestBody User user) {

		logger.info("Invoked add Service");
		logger.debug("Adding user : " + user.getEmail());
		userService.add(user);
		return user;
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {

		logger.info("Invoked delete Service");
		logger.debug("Deleting user with Id : " + id);
		userService.deleteById(id);
		return "Successfully Deleted User of Id : " + id;
	}

}
