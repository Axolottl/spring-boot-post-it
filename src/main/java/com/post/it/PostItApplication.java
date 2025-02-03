package com.post.it;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main PostIt application runtime execution
 */
@SpringBootApplication
@RestController
public class PostItApplication {
	/**
	 * Starts the SpringApplication for PostIts
	 *
	 * @param args The sequence of arguments to pass to the Spring application
	 */
	public static void main(String[] args) {
		SpringApplication.run(PostItApplication.class, args);
	}
}
