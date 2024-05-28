package season7.exerciseOne;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
	public static void main(String[] args) {
		System.out.println("Instanciando objetos data-hora");
		methodOne();
		System.out.println();
		System.out.println("String ISO 8601 => Objeto data-hora");
		methodTwo();
		System.out.println();
		System.out.println("String formato personalizado => Objeto data-hora");
		methodThree();
		System.out.println();
		System.out.println("Instanciando a partir de argumentos");
		methodFour();
	}

	//	Instanciando objetos data-hora
	public static void methodOne() {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
	}

	//	String ISO 8601 => Objeto data-hora
	public static void methodTwo() {
		LocalDate d01 = LocalDate.parse("2024-04-24");
		LocalDateTime d02 = LocalDateTime.parse("2024-04-24T12:59:05");
		Instant d03 = Instant.parse("2024-04-24T12:59:05Z");
		Instant d04 = Instant.parse("2024-04-24T12:59:05-03:00");

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
	}

	//	String formato personalizado => Objeto data-hora
	public static void methodThree() {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d01 = LocalDate.parse("24/04/2024", fmt1);

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d02 = LocalDateTime.parse("24/04/2024 13:15", fmt2);

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
	}

	//	Instanciando a partir de argumentos
	public static void methodFour() {
		LocalDate d01 = LocalDate.of(2024, 4, 24);
		LocalDateTime d02 = LocalDateTime.of(2024, 4, 24, 13, 20);

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
	}
}
