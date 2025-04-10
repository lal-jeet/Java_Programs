package predefineFunctionalInterfacePrograms;

import java.util.Scanner;
import java.util.function.Consumer;

/*interface Consumer<T>
{
	int number(T x);
	String name(T y);
}*/

public class ValueModifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String name = sc.nextLine();
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		Consumer<String> upper = str -> System.out.println(name+" in capital "+str.toUpperCase());
		Consumer<Integer> number = n -> System.out.println(num+" Squre is "+ n*n); 
		
		
        upper.accept(name);
        number.accept(num);
        
        sc.close();
	}

}
