package chapter9;

import java.text.NumberFormat;

public class Rectangle {
	
	private double width,height;
	public Rectangle(){
		width=1.0;
		height=1.0;
	}
	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	public void show() {
		String message;
		message="Width : " + getWidth()+ '\n'+ "Height : " + getHeight() +'\n'+ "Area :"+
		 getFormatted(getArea()) +'\n' + "Perimeter : " + getFormatted(getPerimeter());
		System.out.println(message);
		
		
	}

	private double getHeight() {
			return height;
	}

	public  double getWidth() { 
				return width;
	}
	public String getFormatted(double number) {
		NumberFormat nFormat=NumberFormat.getInstance();
	return	nFormat.format(number);
	}

}
	