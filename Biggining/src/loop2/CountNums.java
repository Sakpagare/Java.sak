package loop2;
import java.util.Scanner;

public class CountNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner n=new Scanner(System.in);
//		int a = n.nextInt();
		int a = 45354;
		int count = 0;
		while(a > 0) {
			int rem = a % 10;
			if(rem == 4) {
				count++;
			}
			a = a/ 10;
		}
		System.out.println(count);

	}

}
