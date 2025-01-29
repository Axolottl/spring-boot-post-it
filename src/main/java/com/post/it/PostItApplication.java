package com.post.it;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PostItApplication {
	public static void main(String[] args) {
		SpringApplication.run(PostItApplication.class, args);
	}
}
