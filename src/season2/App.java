package season2;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

	}

	/**
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	 */
	public static void exOne() {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();

		if (number < 0) System.out.println(STR."Numero negativo: \{number}");
		if (number == 0) System.out.println(STR."Numero igual a zero: \{number}");
		if (number > 0) System.out.println(STR."Numero positivo: \{number}");
	}

	/**
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	 */
	public static void exTwo() {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();

		if (number % 2 == 0) System.out.println(STR."Numero par: \{number}");
		if (number % 2 != 0) System.out.println(STR."Numero ímpar: \{number}");
	}

	/**
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
	 * indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */
	public static void exThree() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a > b && a % b == 0) System.out.println(STR."Os numeros \{a} e \{b} são multiplos entre si.");
		if (a < b && a % b != 0) System.out.println(STR."Os numeros \{a} e \{b} não são multiplos entre si.");
	}

	/**
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar
	 * em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
	 */
	public static void exFour() {
		Scanner sc = new Scanner(System.in);

		int initialHour = sc.nextInt();
		int finalHour = sc.nextInt();
		sc.close();

		double duration = 0;

		if (finalHour > initialHour) duration = finalHour - initialHour;
		if (finalHour < initialHour) duration = 24 - initialHour + finalHour;

		System.out.println(STR."O jogo durou: \{duration} horas.");
	}

	/**
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir,
	 * calcule e mostre o valor da conta a pagar.
	 * <table>
	 *   <tr>
	 *     <td>Cachorro Quente</td> <td>R$4.00</td>
	 *   </tr>
	 *   <tr>
	 *     <td>X-Salada</td> <td>R$4.50</td>
	 *   </tr>
	 *   <tr>
	 *     <td>X-Bacon</td> <td>R$5.00</td>
	 *   </tr>
	 *   <tr>
	 *     <td>Torrada Simples</td> <td>R$2.00</td>
	 *   </tr>
	 *   <tr>
	 *     <td>Refrigerante</td> <td>R$1.50</td>
	 *   </tr>
	 * </table>
	 */
	public static void exFive() {
		Scanner sc = new Scanner(System.in);

		int codeItem = sc.nextInt();
		int amountItem = sc.nextInt();
		sc.close();

		double total = 0;

		if (codeItem == 1) total = amountItem * 4.00;
		if (codeItem == 2) total = amountItem * 4.50;
		if (codeItem == 3) total = amountItem * 5.00;
		if (codeItem == 4) total = amountItem * 2.00;
		if (codeItem == 5) total = amountItem * 1.50;

		System.out.printf("Valor a pagar: %.2f%n", total);
	}

	/**
	 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
	 * intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
	 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
	 */
	public static void exSix() {
		Scanner sc = new Scanner(System.in);

		double number = sc.nextDouble();
		sc.close();

		if (number > 100.00 || number < 0.0) {
			System.out.println("Valor fora de intervalo!");
		} else if (number <= 25) {
			System.out.println("O valor se encontra no intervalo: [0, 25]");
		} else if (number <= 50) {
			System.out.println("O valor se encontra no intervalo: [25, 50]");
		} else if (number <= 75) {
			System.out.println("O valor se encontra no intervalo: [50, 75]");
		} else {
			System.out.println("O valor se encontra no intervalo: [75, 100]");
		}
	}

	/**
	 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A
	 * seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
	 * (x = y = 0).
	 * <p>
	 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
	 * <p>
	 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
	 */
	public static void exSeven() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();

		if (x > 0.0 && y > 0.0) System.out.println(STR."Eixo x: \{x} - Eixo y: \{y} - Q1");
		if (x < 0.0 && y > 0.0) System.out.println(STR."Eixo x: \{x} - Eixo y: \{y} - Q2");
		if (x < 0.0 && y < 0.0) System.out.println(STR."Eixo x: \{x} - Eixo y: \{y} - Q3");
		if (x > 0.0 && y < 0.0) System.out.println(STR."Eixo x: \{x} - Eixo y: \{y} - Q4");
		if (x == 0.0 && y == 0.0) System.out.println("Origem");
	}

	/**
	 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que
	 * nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
	 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
	 * <p>
	 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre
	 * o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
	 * <p>
	 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário
	 * que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
	 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas
	 * decimais.
	 */
	public static void exEight() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		sc.close();

		double imposto;

		if (salario <= 2000.0) imposto = 0.0;
		else if (salario <= 3000.0) imposto = (salario - 2000.0) * 0.08;
		else if (salario <= 4500.0) imposto = (salario - 3000.0) * 0.18 + 1000 * 0.08;
		else imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

		if (imposto == 0.0) System.out.println("Isento");
		else System.out.printf("R$ %.2f%n", imposto);
	}
}
