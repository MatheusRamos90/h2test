package br.com.matheusramos.h2test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
		"br.com.matheusramos.h2test.entity"
})
@EnableJpaRepositories(basePackages = {
		"br.com.matheusramos.h2test.repository"
})
public class H2testApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2testApplication.class, args);
	}

}
