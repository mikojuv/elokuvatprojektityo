package fi.haagahelia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.domain.Movie;
import fi.haagahelia.domain.MovieRepository;

@SpringBootApplication
public class MovieCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCrudApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(MovieRepository repository) {
		return (args) -> {

			};	
	}
}
