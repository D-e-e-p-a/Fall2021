package chapter9;
import java.util.Scanner;



import java.math.*;

public class LargeFactorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer :");
		int n= sc.nextInt();
		factorial(n);
		
		sc.close();

	}
	
	
	public static void factorial(int n) {
		BigInteger result =BigInteger.ONE;
		for (int i=0;i<=n;i++) 
			result=result.multiply(new BigInteger(n+" "));
		
		System.out.println(result);
		
	}
	
	

}
