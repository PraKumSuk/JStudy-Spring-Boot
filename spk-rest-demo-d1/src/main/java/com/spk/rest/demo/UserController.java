package com.spk.rest.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> findAllUsers() {

		return userService.findAll();
	}

	@PostMapping("/add")
	public User add(@RequestBody User user) {

		userService.add(user);

		return user;
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {

		userService.deleteById(id);

		return "Successfully Deleted User of Id : " + id;
	}

}
