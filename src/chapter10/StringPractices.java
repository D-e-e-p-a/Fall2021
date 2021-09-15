package chapter10;



public class StringPractices {
	
	private String text;
	
	public StringPractices(String s) {
		String text=s;
	}

	public static void main(String[] args) {
		System.out.println("Hi, ABC, good".matches("ABC "));
		System.out.println("Hi, ABC, good".matches(".*ABC.*"));
		System.out.println("A,B;C".replaceAll(",:", "#"));
		System.out.println("A,B;C".replaceAll("[,:]", "#"));
		
		
		String[] token ="A,B;C".split("[,:]");
		for (int i=0;i<token.length;i++)
			System.out.println(token[i] +" ");
		
		StringPractices test=new StringPractices("ABC");
		System.out.println(test.text.toLowerCase());
		

	}

}
