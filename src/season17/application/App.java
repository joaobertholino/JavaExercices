package season17.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		System.out.println("MethodOne Open");
		methodOne();
		System.out.println("MethodOne Close");
		System.out.println();
		System.out.println("MethodTwo Open");
		methodTwo();
		System.out.println("MethodTwo Close");
	}

	public static void methodOne() {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

//		Covertendo um List em uma Stream e convertendo uma Stream em um Array
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));

//		Criado uma Stream com valores pre-definidos e convertendo em Array
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

//		Utilizando método que aplica uma função a um valor inicial retornando uma nova Stream e definindo um limite de aplicações
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		Stream<Long> st4 = Stream.iterate(new long[]{0L, 1L}, p -> new long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(15).toArray()));
	}

	public static void methodTwo() {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

//		Utilizando o método map para aplicar uma função a cada elemento de uma Stream, retornando uma nova Stream
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

//		Utilizando o método reduce para aplicar uma função de soma e retornando o valor do resultado
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("Sum = " + sum);

//		Utilizando filter para filtrar os elementos de uma Stream com base em um predicado e utilizando map para aplicar uma função de multiplicação
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).toList();
		System.out.println(Arrays.toString(newList.toArray()));
	}
}
