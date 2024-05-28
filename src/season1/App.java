package season1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		exSix();
	}

	/**
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
	 * mensagem explicativa.
	 */
	public static void exOne(){
		Scanner sc = new Scanner(System.in);

		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		sc.close();

		int result = numberOne + numberTwo;

		System.out.println("Total: " + result);

	}

	/**
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
	 * casas decimais conforme exemplos.
	 */
	public static void exTwo(){
		Scanner sc = new Scanner(System.in);

		int raio = sc.nextInt();
		sc.close();

		double area = Math.PI * Math.pow(raio, 2.0);

		System.out.println("AREA: " + area);
	}

	/**
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
	 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
	 */
	public static void exThree(){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int result = a * b - c * d;

		System.out.println("Diferença: " + result);
	}

	/**
	 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	 * decimais.
	 */
	public static void exFour(){
		Scanner sc = new Scanner(System.in);

		int employeeNumber = sc.nextInt();
		int jobHours = sc.nextInt();
		double wagePerHour = sc.nextDouble();
		sc.close();

		double wageTotal = jobHours * wagePerHour;

		System.out.println("Numero do funcionario: " + employeeNumber);
		System.out.printf("Salario do funcionario %d: R$%.2f%n", employeeNumber, wageTotal);
	}

	/**
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
	 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 */
	public static void exFive(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o código da peça 1: ");
		int partValueOne = sc.nextInt();

		System.out.print("Informe o numero de peças 1: ");
		int partAmountOne = sc.nextInt();

		System.out.print("Informe o value unitário da peça 1: ");
		double unitValueOne = sc.nextDouble();

		System.out.print("Informe o código da peça 2: ");
		int partValueTwo = sc.nextInt();

		System.out.print("Informe o numero de peças 2: ");
		int partAmountTwo = sc.nextInt();

		System.out.print("Informe o value unitário da peça 2: ");
		double unitValueTwo = sc.nextDouble();

		double totalValueTwo = partAmountOne * unitValueOne + partAmountTwo * unitValueTwo;
		System.out.printf("Valor a ser pago nas peças %d e %d: %.2f%n", partValueOne, partValueTwo, totalValueTwo);
	}

	/**
	 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
	 * mostre:
	 * <ol>
	 *   <li>A área do triângulo retângulo que tem A por base e C por altura.</li>
	 *   <li>A área do círculo de raio C. (pi = 3.14159)</li>
	 *   <li>A área do trapézio que tem A e B por bases e C por altura.</li>
	 *   <li>A área do quadrado que tem lado B.</li>
	 *   <li>A área do retângulo que tem lados A e B.</li>
	 * </ol>
	 */
	public static void exSix(){
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		double areaOfTheTriangle = a * c / 2;
		System.out.printf("Triangulo: %.3f%n", areaOfTheTriangle);

		double areaOfTheCircle = Math.PI * Math.pow(c, 2);
		System.out.printf("Circle: %.3f%n", areaOfTheCircle);

		double areaOfTheTrapezoid = (a + b) * c / 2;
		System.out.printf("Trapézio: %.3f%n", areaOfTheTrapezoid);

		double areaOfTheSquare = b * b;
		System.out.printf("Quadrado: %.3f%n", areaOfTheSquare);

		double areaOfTheRectangle = a * b;
		System.out.printf("Retângulo: %.3f%n", areaOfTheRectangle);
	}
}
