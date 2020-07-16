package com.tt.EngineServices;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.fasterxml.jackson.core.JsonEncoding;

import org.json.JSONException;
import org.json.JSONObject;
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
		@RequestBody String body) throws JSONException {
		JSONObject js = new JSONObject(body);
		Model model = new Model( js.getString("id"),js.getString("state"), js.getString("model"));
		repository.save(model);

		return new ResponseEntity<>(model, HttpStatus.OK);
	}
}