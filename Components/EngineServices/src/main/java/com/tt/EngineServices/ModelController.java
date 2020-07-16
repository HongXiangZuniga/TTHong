package com.tt.EngineServices;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.fasterxml.jackson.core.JsonEncoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ModelController {
	@Autowired
  	private ModelRepository repository;


    private static final String TEMPLATE = "Hello, %s!";
    
    @RequestMapping("/model")
	public HttpEntity<Model> model(
		@RequestParam(value = "state", defaultValue = "vacio") String name,@RequestBody String body) {
		System.out.print(body);
		repository.deleteAll();
		repository.save(new Model(body, body, body));
		Model model = new Model(String.format(TEMPLATE, name));
		model.add(linkTo(methodOn(ModelController.class).model(name, body)).withSelfRel());

		return new ResponseEntity<>(model, HttpStatus.OK);
	}
}