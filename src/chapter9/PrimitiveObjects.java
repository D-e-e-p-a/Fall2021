package chapter9;

public class PrimitiveObjects {

	public static void main(String[] args) {
		
		Integer i=Integer.valueOf(23);              //new Integer("23");
		Integer ii= Integer.valueOf("23") ;                              //new Integer(23);
		System.out.println(i + "---"+ ii);
		
		System.out.println(Integer.parseInt("23",8));
		
		//Double double1=new Double();
		
		System.out.println(Double.valueOf("23"));
		

	}

}

