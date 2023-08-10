package loop2;
import java.util.Scanner;
public class Fibe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		int x =st.nextInt();
		int a = 0;
		int b = 1;
		int count =2;
		
		while(count < x)
		{
			int temp = b;
			b = b +a;
			a =temp;
			count++;
		}
		System.out.println(b);

	}

}

