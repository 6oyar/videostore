package com.myproject.videostore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class Application {

	@Value("${spring.content.fs.filesystemRoot}")
	private String filesystemRoot;

	@Autowired
	private VideoProvider videoProvider;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(VideoRepository repository, VideoStore store) {
		return (args) -> {
			Video video = new Video(1L);
			store.setContent(video, new FileInputStream(filesystemRoot + "1.png"));
			repository.save(video);
		};
	}
}
