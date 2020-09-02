package io.sameesh.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public ResponseEntity<String> getInstanceName(){
		return new ResponseEntity(instance, HttpStatus.OK);
	}
}
