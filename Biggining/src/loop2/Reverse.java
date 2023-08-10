package loop2;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		 int ans = 0;
		 while(num > 0) {
			 int rem = num % 10;
			 num /=10;
			 
			 ans = ans * 10 + rem;
		 }
		 System.out.println(ans);
		

	}

}