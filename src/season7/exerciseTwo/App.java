package season7.exerciseTwo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
	public static void main(String[] args) {
		System.out.println("Objeto data-hora => String");
		methodOne();
		System.out.println();
		System.out.println("Objeto data-hora => Formato de String personalizada - pt1");
		methodTwo();
		System.out.println();
		System.out.println("Objeto data-hora => Formato de String personalizada - pt2");
		methodThree();
		System.out.println();
		System.out.println("Objeto data-hora global => Objeto data-hora local");
		methodFour();
		System.out.println();
		System.out.println("Obter dados de uma data-hora local");
		methodFive();
		System.out.println();
		System.out.println("Imprimindo todos os IDs de ZoneId");
		zoneIds();
		System.out.println();
	}

	//	Objeto data-hora => String
	public static void methodOne() {
		LocalDate d01 = LocalDate.of(2024, 04, 24);
		String s01 = d01.toString();

		System.out.println(s01);
	}

	//	Objeto data-hora => Formato de String personalizada - Pt1
	public static void methodTwo() {
		LocalDate d01 = LocalDate.parse("2024-04-24");
		LocalDateTime d02 = LocalDateTime.parse("2024-04-24T16:25:15");
		Instant d03 = Instant.parse("2024-04-24T16:25:15Z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d03 = " + fmt3.format(d03));
	}

	//	Objeto data-hora => String ISO 8601 – pt2
	public static void methodThree() {
		LocalDateTime d01 = LocalDateTime.parse("2024-04-24T16:25:15");
		Instant d02 = Instant.parse("2024-04-24T16:25:15Z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt2 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d02 = " + fmt2.format(d02));
	}

	//	Objeto data-hora global => Objeto data-hora local
	public static void methodFour() {
		Instant d03 = Instant.parse("2024-04-24T01:25:15Z");

		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
	}

	//	Obter dados de uma data-hora local
	public static void methodFive() {
		LocalDateTime d01 = LocalDateTime.parse("2024-04-24T16:25:15.56598");

		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 mes = " + d01.getMonth());
		System.out.println("d01 numero do mes = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		System.out.println("d01 hora = " + d01.getHour());
		System.out.println("d01 minuto = " + d01.getMinute());
		System.out.println("d01 segundos = " + d01.getSecond());
		System.out.println("d01 nano-segundos = " + d01.getNano());
		System.out.println("d01 cronologia = " + d01.getChronology());
	}

	//	Imprimindo todos os IDs de ZoneId
	public static void zoneIds() {
		for (String id : ZoneId.getAvailableZoneIds()) System.out.println(id);
	}
}
