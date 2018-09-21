package com.myproject.videostore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Value("${spring.content.fs.filesystemRoot}")
	private String filesystemRoot;

	@Test
	public void contextLoads() {
		assert filesystemRoot.equals("C:/IdeaProjects/videostore/src/main/resources/");
	}

}
