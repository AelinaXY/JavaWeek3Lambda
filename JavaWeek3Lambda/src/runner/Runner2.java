package runner;

import java.util.List;
import java.util.stream.Collectors;

public class Runner2 {

	public static void main(String[] args) {

//		Calculation calc = new Calculation() {
//			@Override
//			public int calc(int a, int b) {
//				return a + b;
//			}
//		};
//
//		Calculation add = (a, b) -> a + b;
//		Calculation sub = (a, b) -> a - b;
//		Calculation mult = (a, b) -> a * b;
//		Calculation div = (a, b) -> a / b;
//
////		System.out.println(calc.calc(2, 3));
//		System.out.println(add.calc(4, 6));
//		System.out.println(sub.calc(4, 6));
//		System.out.println(mult.calc(4, 6));
//		System.out.println(div.calc(4, 6));

		List<String> nameList = List.of("Micheal", "Dean", "James", "Chris");

		nameList.stream().forEach(name -> System.out.println("Hello " + name));

		List<Integer> intList = List.of(3, 4, 7, 8, 12);

		System.out.println(intList.stream().min(Integer::compare).get());
		System.out.println(intList.stream().max(Integer::compare).get());

		System.out.println(intList.stream().filter(e -> e % 2 != 0).collect(Collectors.toList()));
		System.out.println(intList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));

		System.out.println(intList.stream().reduce(0, Integer::sum));

		System.out.println(intList.stream().map(e -> e * e).filter(e -> e % 2 != 0).min(Integer::compare).get());

	}

}
