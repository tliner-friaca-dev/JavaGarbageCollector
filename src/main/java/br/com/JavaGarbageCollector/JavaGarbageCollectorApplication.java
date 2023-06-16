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

		Usuario[] usuarios = new Usuario[10_000_000];

		for (int i = 0; i < usuarios.length; i++) {
			Usuario usuario = new Usuario(Long.valueOf(i), "usuario" + i, "usuarioMail" + i);
			usuarios[i] = usuario;
			// System.out.println(usuario.id());
		}

		System.out.println("Usuários criados!!!");
		System.out.print("Memória utilizada: ");
		obterMemoriaUsada();
		System.out.println("MB");

		usuarios = null;

		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();

		System.out.println("\nUsuários removidos da memória!!!");
		System.out.print("Memória utilizada: ");
		obterMemoriaUsada();
		System.out.print("MB");
	}

	public static void obterMemoriaUsada() {
		final int MB = 1024 * 1024;
		Runtime runtime = Runtime.getRuntime();
		System.out.print((runtime.totalMemory() - runtime.freeMemory()) / MB);
	}

}
