package chapter9;

public class Course {
	private String courseName;

	private String[] students = new String[5];
	private int numberOfStudents;

	Course(String courseName) {
		// this.size=size;
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void addStudent(String name) {
		if(numberOfStudents==students.length) {
			String[] student = new String[numberOfStudents*2];
			for (int i=0;i<numberOfStudents;i++)
				student[i]=students[i];
			students=student;		
		}

		students[numberOfStudents] = name;
		numberOfStudents++;

	}

	public String[] getStudents() {
		String[] studentList = new String[students.length];
		for (int i = 0; i < students.length; i++) {
			studentList[i] = students[i];
		}
		return studentList;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void dropStudent(String student) {
		
		int i = 0, k = 0;

		for (i = 0; i < numberOfStudents; i++)
			if (students[i].equals(student))
				break;
		for (k = i; k < numberOfStudents; k++)
			students[k] = students[k + 1];
		numberOfStudents--;

		
	}
	
	public void show() {
				
		
				String message= "Name of the course:"+ getCourseName()+'\n'+"Number of Students :" + getNumberOfStudents();
				System.out.println(message);
				String result[]=getStudents();
				for (int i=0;i<numberOfStudents;i++) {
					if (i>0) {
						System.out.print( ",");
					}
					if (result[i] != null)						
						System.out.print( result[i]);
					
				}
	}

}
