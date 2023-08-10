package basiccon;
import java.util.Scanner;

public class QT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b :");
		int x =s.nextInt();
		int y=s.nextInt();
		System.out.println("Sum of two integers: "+ (x+y));
		System.out.println("Difference of two integers: "+(x-y));
		System.out.println("product of two integers:"+ x*y);
		System.out.println("average of two integer: "+ (x+y)/2);
		System.out.println("max integer: "+ Math.max(x, y));
		System.out.println("min integer: "+ Math.min(x, y));

	}

}
