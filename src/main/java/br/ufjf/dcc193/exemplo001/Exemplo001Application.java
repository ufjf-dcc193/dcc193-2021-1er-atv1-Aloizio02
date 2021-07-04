package br.ufjf.dcc193.exemplo001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;

@EnableAutoConfiguration
@SpringBootApplication
public class Exemplo001Application {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo001Application.class, args);
	}
}
