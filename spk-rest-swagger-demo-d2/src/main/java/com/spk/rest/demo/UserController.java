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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
//Below info appears next to the Controller name in Swagger Doc
@Api(value = "SPK RESTful User Service APP", description = "Operations pertaining to users in SPK App, especially"
		+ "shows demo of Swagger2")
public class UserController {

	static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	// Below info appears next to service in Swagger Doc
	@ApiOperation(value = "Gets all the Users in the system", response = List.class)
	// Below Swagger messages for appropriate codes
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	public List<User> findAllUsers() {

		logger.info("Invoked findAllUsers Service");
		logger.debug("Fetching all users");
		return userService.findAll();
	}

	@ApiOperation(value = "Add a new User in the system")
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
