package loop2;
import java.util.Scanner;
public class L3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 3 numbers: ");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		int max = x;
		if(max < y) 
		{
			max = y;
		}
		if(max < z)
		{
			max = z;
		}
		System.out.println("The largest number from given is: "+max);

	}

}

