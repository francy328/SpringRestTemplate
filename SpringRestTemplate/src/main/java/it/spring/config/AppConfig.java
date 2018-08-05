package it.spring.config;


import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("it.spring.config")
				
public class AppConfig {

/*
	questa classe mi definisce un bean per usare la classe RestTemplate
	inoltre inizializza la classe usando come convert (da pojo a json la jackson 
*/
	
	

	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		//MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
		//converter.setObjectMapper(new ObjectMapper());
		//restTemplate.getMessageConverters().add(converter);
		return restTemplate;
	}
}
