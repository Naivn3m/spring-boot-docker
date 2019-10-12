package application.controllers;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import application.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class InstituteController {

	@Autowired
	private RestTemplate restTemplate;
	
	String RATING_URL = "http://localhost:8083/rating/";
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello World!";
	}
	
	@RequestMapping("/{instId}")
	public List<CatalogItem> getCatalogs(@PathVariable("instId") String instId){
		
		String rating = restTemplate.getForObject(RATING_URL+instId, String.class);
		
		return Collections.singletonList(
					new CatalogItem("1", "Mahesh Tuts", rating , "SSC, HSC, 8, 9")
				);
	}
}
