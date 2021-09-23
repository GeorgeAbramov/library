package ru.sberbank.library;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.SQLException;

@SpringBootApplication
public class LibraryApplication {


	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@ComponentScan
	@EnableAutoConfiguration
	public class Application {

		public Application() throws SQLException {
		}

		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}
	}


}
