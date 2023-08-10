package basiccon;
import java.util.Scanner;

public class QT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number to aceess: ");
		int x = s.nextInt();
		int x1 = x/1000 % 10 ;
		int x2 = x/100 % 10;
		int x3 = x/10 % 10;
		int x4 =x % 10;
		System.out.println(x1+" "+x2+" "+x3+" "+x4);

	}

}
