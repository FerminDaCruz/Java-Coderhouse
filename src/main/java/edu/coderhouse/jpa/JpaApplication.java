package edu.coderhouse.jpa;

import edu.coderhouse.jpa.services.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	public DaoFactory daoFactory;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
