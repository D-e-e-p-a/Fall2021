package chapter10;

import chapter9.thisDemo;

public class MyInteger {
	private int value;

	MyInteger() {

	}

	MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean equals(int a) {
		if (this.value == a)
			return true;
		else
			return false;

	}
	public static void parseInt(String a) {
		
		System.out.println(Integer.parseInt(a));
	}
	public static void parseInt(char[] a) {
		for(int i=0;i<a.length;i++)	{
			
			System.out.println(Integer.parseInt(String.valueOf(a)));
		}	
	}

	public boolean equals(MyInteger a) {
		if (this.value == a.value)
			return true;
		else
			return false;

	}

	public boolean isEven(MyInteger val) {
		value = val.value;
		return isEven();

	}

	public boolean isOdd(int value) {
		this.value = value;
		return isOdd();

	}

	public boolean isPrime(int value) {
		this.value = value;
		return isPrime();

	}

	public boolean isEven() {
		if ((value % 2) == 0)
			return true;
		else
			return false;

	}

	public boolean isOdd() {
		if ((value % 2) != 0)
			return true;
		else
			return false;

	}

	public boolean isPrime() {
		boolean num = true;

		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				num = false;
		}

		return num;
	}

}
