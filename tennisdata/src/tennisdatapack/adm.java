package tennisdatapack;

import java.util.Scanner;

public class adm {
	public static void main(String[] args){
		System.out.println("Welcome to Tennis Data");
		System.out.println("");
		//It's important that the user log in.
		System.out.print("Enter your user name: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();
		System.out.println("");
		System.out.println("Los datos ingresados fueron: ");
		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
		scanner.close();
	}
}
