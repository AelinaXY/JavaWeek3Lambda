package runner;

public class Runner2 {

	public static void main(String[] args) {

//		Calculation calc = new Calculation() {
//			@Override
//			public int calc(int a, int b) {
//				return a + b;
//			}
//		};

		Calculation add = (a, b) -> a + b;
		Calculation sub = (a, b) -> a - b;
		Calculation mult = (a, b) -> a * b;
		Calculation div = (a, b) -> a / b;

//		System.out.println(calc.calc(2, 3));
		System.out.println(add.calc(4, 6));
		System.out.println(sub.calc(4, 6));
		System.out.println(mult.calc(4, 6));
		System.out.println(div.calc(4, 6));

	}

}
