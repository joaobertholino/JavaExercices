package season3;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		teste();
	}

	/**
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
	 * X, se for o caso.
	 */
	public static void exOne() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		sc.close();

		int i = 1;
		while (i <= x) {
			if (i % 2 != 0) System.out.println(i);
			i++;
		}
	}

	/**
	 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre
	 * quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
	 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
	 */
	public static void exTwo() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int in = 0;
		int out = 0;

		int i = 1;
		while (i <= n) {
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) in++;
			else out++;
			i++;
		}

		System.out.println(STR."Dentro do intervalo [10, 20]: \{in} numeros!");
		System.out.println(STR."Fora do intervalo [10, 20]: \{out} numeros!");
	}

	/**
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de
	 * 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
	 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
	 */
	public static void exThree() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double x, y, z;

		int i = 1;
		while (i <= n) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();

			double media = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
			i++;
		}
		sc.close();
	}

	/**
	 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
	 * Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
	 */
	public static void exFour() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double x;
		double y;

		int i = 1;
		while (i <= n) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (y == 0) System.out.println("Divisão impossivel!");
			else {
				double divide = x / y;
				System.out.printf("%.1f%n", divide);
			}
			i++;
		}
		sc.close();
	}

//	TODO: Revisar logica de calculo de fatorial
	/**
	 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
	 * Lembrando que, por definição, fatorial de 0 é 1.
	 */
	public static void exFive() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		int fat = 1;

		int i = 1;
		while (i <= n) {
			fat *= i;
			i++;
		}

		System.out.println(fat);
	}

	/**
	 * Ler um número inteiro N e calcular todos os seus divisores.
	 */
	public static void exSix() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		sc.close();

		int i = 1;
		while (i <= x) {
			if (x % i == 0) System.out.println(i);
			i++;
		}
	}

	/**
	 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando
	 * de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
	 */
	public static void exSeven() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			int powerTwo = (int) Math.pow(i, 2);
			int powerThree = (int) Math.pow(i, 3);

			System.out.println(STR."\{i} \{powerTwo} \{powerThree}");
			i++;
		}
	}

	/**
	 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
	 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
	 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
	 */
	public static void exEight(){
		Scanner sc = new Scanner(System.in);
		int password;

		do {
			password = sc.nextInt();
			if (password == 2002) System.out.println("Acesso liberado!");
			else System.out.print("Acesso negado! - Digite a senha novamente: ");
		} while (password != 2002);

		sc.close();
	}

	/**
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
	 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
	 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
	 */
	public static void exNine() {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;

		do {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x < 0 && y > 0) System.out.println(STR."Quadrante Q1 -> x: \{x}, y: \{y}");
			else if (x > 0 && y > 0) System.out.println(STR."Quadrante Q2 -> x: \{x}, y: \{y}");
			else if (x < 0 && y < 0) System.out.println(STR."Quadrante Q3 -> x: \{x}, y: \{y}");
			else if (x > 0 && y < 0) System.out.println(STR."Quadrante Q4 -> x: \{x}, y: \{y}");
		} while (x != 0 && y != 0);

		sc.close();
	}

	/**
	 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
	 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
	 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
	 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
	 * exemplo.
	 */
	public static void exTen() {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int typeCode;
		do {
			System.out.print("Insira o codigo do produto: ");
			typeCode = sc.nextInt();

			if (typeCode == 1) alcool++;
			else if (typeCode == 2) gasolina++;
			else if (typeCode == 3) diesel++;
			else System.out.println("Codigo invalido - Digite-o novamente!");
		} while (typeCode != 4);

		System.out.println("Muito obrigado!");
		System.out.println(STR."Alcool: \{alcool}");
		System.out.println(STR."Gasolina: \{gasolina}");
		System.out.println(STR."Diesel: \{diesel}");
	}

	public static void teste(){
		String teste = "Teste";
		System.out.println(teste.substring(1));
	}
}
