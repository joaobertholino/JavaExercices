package season18.application;

import season18.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Fazer um programa para ler os dados (nome, email e salário)
 * de funcionários a partir de um arquivo em formato .csv.
 * <p>
 * Em seguida mostrar, em ordem alfabética, o email dos
 * funcionários cujo salário seja superior a um dado valor
 * fornecido pelo usuário.
 * <p>
 * Mostrar também a soma dos salários dos funcionários cujo
 * nome começa com a letra 'M'.
 */
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		try (BufferedReader br = new BufferedReader(new FileReader(in.next()))) {
			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] splited = line.split(",");
				list.add(new Employee(splited[0], splited[1], Double.parseDouble(splited[2])));
				line = br.readLine();
			}

			System.out.println("Enter a salary value for the filter: ");
			double wageFilter = in.nextDouble();

			List<Employee> listFiltered = list.stream().filter(e -> e.getWage() > wageFilter).toList();
			System.out.println("Email of people whose salary is more than " + wageFilter);
			listFiltered.forEach(e -> System.out.println(e.getEmail()));

			double sum = list.stream().filter(e -> e.getName().charAt(0) == 'M').map(Employee::getWage).reduce(0.0, Double::sum);
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

			in.close();
		} catch (IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
			in.close();
		}
	}
}
