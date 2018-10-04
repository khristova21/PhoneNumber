/**
 *Krisi Hristova 
 *Phone Number
 */
import java.util.Scanner;

public class PhoneNumber 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = in.next();
		in.nextLine();
		
		System.out.print("Enter your phone number: ");
		String phone = in.next();
		in.nextLine();
		
		String number = "(" + phone.substring(0,3) + ")" + " "+ phone.substring(3,6) + " " + phone.substring(6);		
		System.out.printf("%-20s %10s", name, number);
	}
}
