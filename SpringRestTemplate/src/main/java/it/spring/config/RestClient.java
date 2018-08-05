package it.spring.config;

import java.util.List;
import org.springframework.http.HttpStatus;
import it.spring.model.Abbonamento;


public interface RestClient {
	List<Abbonamento> getAbbonamenti();

}
