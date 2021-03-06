package chapter10;



public class BMI {

	public static void main(String[] args) {
		
		BMI one =new BMI("kim yang",18,145,70);
		BMI twoBmi=new BMI("Susan",215,70);
		
		one.display();
		twoBmi.display();
		
		

	}

	private String name;
	private int age;
	private double weight;// in pounds
	private double height;// in inches
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	public BMI(String name,int age,double weight,double feet,double inches) {
		this(name,age,weight,(feet*12)+inches);
	}

	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round(bmi * 100) / 100.0;

	}
	public String getStatus() {
		double bmi=getBMI();
		if(bmi<18.5) return "Underweight";
		if(bmi<25)return "Normal";
		if(bmi<30) return "Overweight";
		else return "obese";
		
		
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public void display() {
		String messageString="The BMI for  " + getName() + " is " + getBMI() +" ---> "+ getStatus();
		System.out.println(messageString);
	}
}
