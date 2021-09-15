package chapter9;

public class courseApp {

	public static void main(String[] args) {

		

		Course course1 = new Course("Data Structures");
		course1.addStudent("Tom");
		course1.addStudent("Jim");
		course1.addStudent("Jack");
		course1.addStudent("Tim");
		course1.addStudent("Bob");
		course1.addStudent("Bid");
		course1.addStudent("Jik");
		course1.addStudent("Tin");
		course1.show();

		course1.dropStudent("Jim");
		System.out.println();
		course1.show();


	}

}
