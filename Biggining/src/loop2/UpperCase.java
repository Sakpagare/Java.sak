package loop2;
import java.util.Scanner;
public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words: ");
		char s = sc.next().charAt(0);
		
		if( s >= 'a' && s <= 'z')
		{
			System.out.println("lowercase letters");
		}
		else
		{
			System.out.println("uppercase letters");
		}

	}

}
