package fbb;

public class FooBarBaz {
	public void doService() {
		for (int number=1; number <= 16 ; number++) {
			if (number<10 ) {
				System.out.print(" "+ number);
			} else {
				System.out.print(number);
			}
			if ((number % 3)==0) {
				System.out.print(" foo");
			}
			if ((number % 5)==0) {
				System.out.print(" bar");
			}
			System.out.println();
		}
		System.out.println("\n and so on.");
	}

}
