package com.hussain;

import com.hussain.model.Post;
import com.hussain.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class SpringBootDockerComposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerComposeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository repository) {
		return args -> {
			repository.deleteAll();
			log.info("Post deleted successfully...");
			repository.save(new Post("Hello World!", "My first blog post!"));
			repository.save(new Post("Hello World 2!", "My second blog post!"));
			log.info("Post saved successfully...");
		};
	}
}
