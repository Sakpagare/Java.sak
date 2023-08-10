package basiccon;

import java.util.Scanner;

public class QT1 {
	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit: ");
		double fahrenheit = s.nextDouble();
		
		double celcius =((5*(fahrenheit-32.0))/9.0);
		System.out.println(fahrenheit +" degree fahrenheit is equal to " + celcius +" in celcius");
	}

}
