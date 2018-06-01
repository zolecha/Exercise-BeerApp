package pl.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.exercise.model.Beer;
import pl.exercise.service.BeerService;

@SpringBootApplication
public class BeerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerAppApplication.class, args);
	}
	Beer beer;
	@Bean
	CommandLineRunner runner(BeerService beerService) {
	
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Beer>> typeReference = new TypeReference<List<Beer>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/beers.json");

			try {
				List<Beer> beers = mapper.readValue(inputStream,typeReference);
				beerService.save(beers);
			} catch (IOException e){
				System.out.println(e.getMessage());
			}
		};
		
		
	}
}
