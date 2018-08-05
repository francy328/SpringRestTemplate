package it.spring.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.spring.config.RestClient;
import it.spring.model.Abbonamento;


@Service
public class RestClientImpl implements RestClient{
	
	@Autowired
	RestTemplate restTemplate;
	
	final String ROOT_URI = "http://localhost:8080/flexbenServices/circuiti/9/movimenti";

	public List<Abbonamento> getAbbonamenti() {

		ResponseEntity<Abbonamento[]> response = restTemplate.getForEntity(ROOT_URI, Abbonamento[].class);
		return Arrays.asList(response.getBody());
		
		//return null;
	}

}
