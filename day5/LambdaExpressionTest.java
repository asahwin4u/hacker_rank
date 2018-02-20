package com.capgemini.day5;

public class LambdaExpressionTest {
	int x = 10;

	public void m2() {
		int y = 20;
		Interf i = () -> { // ///////////closure
			System.out.println(x);
			// System.out.println(y);
			System.out.println(this.getClass());
			x = 100;
			// y=200;//Local variable y defined in an enclosing scope must be
			// final or effectively final
			// local variables referenced from a lambda expression must be final
			// or effectively final
		};
		// y=200; // you can use this assignment if you are not using in Lambda
		// expression
		// System.out.println(y);
		i.m1();
	}

	public static void main(String[] args) {
		LambdaExpressionTest t = new LambdaExpressionTest();
		t.m2();
		t.m3();
	}
	public void m3()
	{
		Interf i = () -> {
			System.out.println("this is m3");
		};
		i.m1();
	}
}

interface Interf {
	public void m1();
}