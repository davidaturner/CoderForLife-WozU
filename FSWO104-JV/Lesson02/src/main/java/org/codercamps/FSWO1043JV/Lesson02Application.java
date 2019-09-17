package org.codercamps.FSWO1043JV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Lesson02Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson02Application.class, args);
	}

}
