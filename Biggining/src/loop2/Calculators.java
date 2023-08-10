package loop2;
import java.util.Scanner;
public class Calculators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 int ans =0 ;
		 while(true) {
			 System.out.println("enter the operators: ");
			 char op =in.next().charAt(0);
			 
			 if(op == '+' || op == '-' || op =='*' || op =='/' || op == '%') {
				 System.out.println("enter the numbers: ");
				 int a = in.nextInt();
				 int b = in.nextInt();
				 
				 if(op == '+') {
					 ans = a + b;
				 }
				 
				 if(op == '-') {
					 ans = a - b;
				 }
				 
				 if(op == '*') {
					 ans = a * b;
				 }
				 
				 if(op == '/') {
					 if(b!=0) {
					 ans = a / b;
					 }
				 }
				 if(op == '%') {
					 ans = a % b;
				 }else if (op == 'x' || op == 'X') {
					 break;
				 }
				 else {
					 System.out.println(ans);
				 }
			 }
		 }

	}

}

