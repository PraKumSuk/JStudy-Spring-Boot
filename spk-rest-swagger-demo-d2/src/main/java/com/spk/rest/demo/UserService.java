package com.spk.rest.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	static final Logger logger = LoggerFactory.getLogger(UserService.class);

	private static List<User> users = new ArrayList<>();
	static {
		
		logger.info("Adding pre defined Users...........");
		users.add(new User(101, "Aaa", LocalDate.of(1951, 1, 11), "aaa@spring.com", "9999999999"));
		users.add(new User(102, "Bbb", LocalDate.of(1952, 2, 12), "bbb@spring.com", "8888888888"));
		users.add(new User(103, "Ccc", LocalDate.of(1953, 3, 13), "ccc@spring.com", "7777777777"));
		users.add(new User(104, "Ddd", LocalDate.of(1954, 4, 14), "ddd@spring.com", "6666666666"));
		users.add(new User(105, "Eee", LocalDate.of(1955, 5, 15), "eee@spring.com", "5555555555"));
		users.add(new User(106, "Fff", LocalDate.of(1956, 6, 16), "fff@spring.com", "4444444444"));
	}

	public List<User> findAll() {
		logger.info("Starting  findAll method");
		logger.info("Completed  findAll method");
		return users;
	}

	public void add(User user) {
		logger.info("Starting  add method");
		user.setId(generateRandomId());
		users.add(user);
		logger.info("Completed  add method");
	}

	private int generateRandomId() {
		logger.debug("Starting  generateRandomId method");
		logger.debug("Completed  generateRandomId method");
		return new Random().nextInt(1000);
	}

	public List<User> deleteById(int id) {
		logger.info("Starting  deleteById method");
		users.removeIf(u -> u.getId() == id);
		logger.info("Completed  deleteById method");
		return findAll();
	}

	public Optional<User> find(int id) {
		logger.debug("Starting  find method");
		logger.debug("Completed  find method");
		return users.stream().filter(u -> u.getId() == id).findFirst();
	}

}
