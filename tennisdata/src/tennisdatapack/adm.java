package tennisdatapack;

import java.util.Scanner;

public class adm {
	public static void main(String[] args){
		System.out.println("Welcome to Tennis Data");
		System.out.println("======================");
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
		System.out.println("");
		// This is my attempt to control the login
		if (username.equals("oreste") && password.equals("fish")){
			System.out.println("Welcome to the system");
		}else{
			System.out.println("Error with the login, please try again");
		}
		System.out.println("");
<<<<<<< HEAD
		System.out.println("Estoy en OM en eclipse");
=======
>>>>>>> branch 'master' of https://github.com/OresteMaresca/TennisData.git
		scanner.close();
	}
}
