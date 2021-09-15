package chapter9;

public class EncapsulationDemo {

	private int number;
	private boolean happy;
	
	public EncapsulationDemo(){
		this.happy=true;
		this.number=1;;
		
	}
	public EncapsulationDemo(int number){
		this();
		this.setNumber(number);
		
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public boolean isHappy() {
		return happy;
	}

	public void setHappy(boolean happy) {
		this.happy = happy;
	}
	public void show() {
		System.out.println(getNumber() + " || "+ isHappy());
	}

	
}
