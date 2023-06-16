package br.com.JavaGarbageCollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGarbageCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaGarbageCollectorApplication.class, args);
		
		System.out.println("\n----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------\n");
		
	}

}
