package basicjava;

import java.util.Scanner;

public class IfStatementUsingString 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Your Username: ");
		String usn=s.next();
		System.out.println("Enter Your Password: ");
		String pwd=s.next();
		
		if(usn.equals("sagar") && pwd.equals("sagar@123"))
		{
			System.out.println("Login Successful....");
		}
		else
		{
			System.out.println("Incorrect Login....");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
