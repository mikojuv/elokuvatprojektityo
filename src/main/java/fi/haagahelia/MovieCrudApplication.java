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
			repository.save(new Movie("Avengers: Infinity War", 9 , "Pitkä elokuva, mutta silti näyttävä ja viihdyttävä läpi koko elokuvan"));
			repository.save(new Movie("The Shawshank Redemption", 9, "Jännittävä"));
			};	
	}
}
