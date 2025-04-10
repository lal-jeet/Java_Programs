package predefineFunctionalInterfacePrograms;

import java.util.Scanner;

interface Predicate<T>{
	public boolean apply(T x);
	
}

public class NumberTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for even or prime");
		int num = sc.nextInt();

		Predicate<Integer> isEven = n -> n%2==0;
		Predicate<Integer> isPrime = n -> n%2==1;
		{
			boolean b = isEven.apply(num);
			System.out.println("number  "+num+" is even number "+b);
			boolean p = isPrime.apply(num);
			System.out.println("number  "+num+" is prime number "+p);
			
		}
		sc.close();
		
	}

}
