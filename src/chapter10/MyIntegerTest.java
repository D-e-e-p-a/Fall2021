package chapter10;

public class MyIntegerTest {

	public static void main(String[] args) {
		
		char[] a= {'1','2'};
		MyInteger.parseInt(a);
		String numString="123";
		MyInteger.parseInt(numString);
		MyInteger integer=new MyInteger(10);
		MyInteger integer1=new MyInteger(17);
		
		//System.out.println(integer.isPrime());
		//System.out.println(integer.equals(10));
		//System.out.println(integer.isOdd());
	}

}
