package serverImplementation;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import serverInterface.IAuthentication;

public class Authentication implements IAuthentication {

	@Override
	public String encrypt(String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decrypt(String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	public void requestAuthentication() 
	{
		String user ="temp";
		String pass = "temp";
		
		Scanner in = new Scanner(System.in);
		
		while (!verifyUser(user, pass)) {
			System.out.print("Enter Username: ");
			user = in.nextLine();
			
			System.out.print("Enter Password: ");
			pass = in.nextLine();
			
			if(!verifyUser(user, pass))
				System.out.println("Invalid Username or Password");
		}
		
		ConsoleOutput output = new ConsoleOutput();
		try {
			output.optionsPage();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		in.close();
	}

	public boolean verifyUser(String user, String pass)
	{
	
		if (user.equals(AdminUser) && pass.equals(AdminPass))
			return true;
		
		return false;
	}

}
