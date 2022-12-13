package com.form.demo.controller;
import com.form.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.form.demo.model.*;

@SuppressWarnings("unused")
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class formcontroller {
	
	@Autowired
	private formrep formrep;

	@PostMapping("/register")
	public String regstu(@RequestBody formModel fm)
	{
		formrep.save(fm);
		return "form submitted";
	}
	
}