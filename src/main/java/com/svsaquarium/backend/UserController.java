package com.svsaquarium.backend;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svsaquarium.backend.entity.User;
import com.svsaquarium.backend.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public User createEmployee(@Valid @RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/users")
	public List<User> getAllEmployees() {
		return userService.findAll();
	}
}
