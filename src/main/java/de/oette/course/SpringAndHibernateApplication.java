package de.oette.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("SpellCheckingInspection")
@SpringBootApplication
@ComponentScan(basePackages = "de.oette.course.G01")
@EntityScan(basePackages = "de.oette.course.G01")
public class SpringAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndHibernateApplication.class, args);
	}

}
