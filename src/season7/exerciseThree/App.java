package season7.exerciseThree;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class App {
	public static void main(String[] args) {
		System.out.println("Adição e subtração de tempo em objetos data-hora");
		methodOne();
		System.out.println();
		System.out.println("Diferença de tempo entre dois objetos data-hora");
		methodTwo();
		System.out.println();
		System.out.println("Diferença de tempo entre um objeto Instant e um objeto LocalDateTime");
		methodThree();
		System.out.println();
		System.out.println("Diferença de tempo entre dois objetos Instant");
		methodFour();
		System.out.println();
	}

	//	Adição e subtração de tempo em objetos data-hora
	public static void methodOne() {
		LocalDate d01 = LocalDate.parse("2024-04-24");
		LocalDateTime d02 = LocalDateTime.parse("2024-04-24T17:25:15");
		Instant d03 = Instant.parse("2024-04-24T17:25:15Z");

		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		LocalDateTime pastHoursLocalDateTime = d02.minusHours(7);
		LocalDateTime nextHoursLocalDateTime = d02.plusHours(7);
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("pastHoursLocalDateTime = " + pastHoursLocalDateTime);
		System.out.println("nextHoursLocalDateTime = " + nextHoursLocalDateTime);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
	}

	//	Diferença de tempo entre dois objetos data-hora
	public static void methodTwo() {
		LocalDateTime d01 = LocalDateTime.now();
		LocalDateTime d02 = LocalDateTime.parse("2020-07-23T15:01:00");

		Duration dt1 = Duration.between(d02, d01);

		System.out.println("dt1 nano-segundos = " + dt1.toNanos());
		System.out.println("dt1 millisegundos = " + dt1.toMillis());
		System.out.println("dt1 segundos = " + dt1.toSeconds());
		System.out.println("dt1 minutos = " + dt1.toMinutes());
		System.out.println("dt1 horas = " + dt1.toHours());
		System.out.println("dt1 dias = " + dt1.toDays());
	}

//	Diferença de tempo entre um objeto LocalDate e um objeto LocalDateTime
	public static void methodThree(){
		LocalDate d01 = LocalDate.parse("2024-04-25");
		LocalDateTime d02 = LocalDateTime.parse("2020-07-23T15:01:00");

		Duration dt1 = Duration.between(d02, d01.atStartOfDay());

		System.out.println("dt1 nano-segundos = " + dt1.toNanos());
		System.out.println("dt1 millisegundos = " + dt1.toMillis());
		System.out.println("dt1 segundos = " + dt1.toSeconds());
		System.out.println("dt1 minutos = " + dt1.toMinutes());
		System.out.println("dt1 horas = " + dt1.toHours());
		System.out.println("dt1 dias = " + dt1.toDays());
	}

//	Diferença de tempo entre dois objetos Instant
	public static void methodFour(){
		Instant d01 = Instant.parse("2020-07-23T15:01:00Z");
		Instant d02 = Instant.now();

		Duration dt1 = Duration.between(d01, d02);

		System.out.println("dt1 nano-segundos = " + dt1.toNanos());
		System.out.println("dt1 millisegundos = " + dt1.toMillis());
		System.out.println("dt1 segundos = " + dt1.toSeconds());
		System.out.println("dt1 minutos = " + dt1.toMinutes());
		System.out.println("dt1 horas = " + dt1.toHours());
		System.out.println("dt1 dias = " + dt1.toDays());
	}
}
