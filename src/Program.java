import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Program {
	public static void main(String[]args)
	{
		Calculate test = new Calculate();
		System.out.println(test.Sqrt(1.2));
		
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Your username is " + username);
		
		System.out.println("Enter the number: ");
		double nbr = sc.nextDouble();
		test.Sqrt(nbr);
		System.out.println("The sqrt of the number is : " + test.Sqrt(nbr));

		//Piece piece = new Piece();
	}

}
