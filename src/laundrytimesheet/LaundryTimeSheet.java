//  this main class will control the logic flow of the app
package laundrytimesheet;

import java.util.Scanner;
import java.io.File;

@SuppressWarnings({ "unused", "resource" })
public class LaundryTimeSheet {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Status login = new Status();
		
		if(login.checkStatus()==true) {
			System.out.println("Welcome Back");
		}
		else {
			System.out.println("Enter your name");
			String username = input.next();	
		}

	}

}
