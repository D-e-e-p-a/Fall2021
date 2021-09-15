package chapter10;

public class Time {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		Time t3 = new Time(5, 23, 55);
		t1.display();
		 t2.display();
		 t3.display();

	}

	long hour, minute, seconds, elapseTime;

	Time() {
		long currentMilliseconds = System.currentTimeMillis();
		System.out.println(currentMilliseconds);

		long totalSeconds = (currentMilliseconds / 1000);
		this.seconds = totalSeconds % 60;// current seconds

		long totalminutes = totalSeconds / 60;
		this.minute = totalminutes % 60;// current minutes

		long totalHours = totalminutes / 60;
		this.hour = totalHours % 24;

	}

	Time(long elapseTime) {

		this.elapseTime = elapseTime;
		long totalSeconds = (elapseTime / 1000);
		long totalminutes = totalSeconds / 60;
		long totalHours = totalminutes / 60;

		this.seconds = totalSeconds % 60;// current seconds
		this.minute = totalminutes % 60;// current minutes
		this.hour = totalHours % 24;

	}

	Time(long hour, long minute, long seconds) {

		this.seconds = seconds;// current seconds
		this.minute = minute;// current minutes
		this.hour = hour;

	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSeconds() {
		return seconds;
	}

	public long getElapseTime() {
		return elapseTime;
	}

	public void setElapseTime(long elapseTime) {
		this.elapseTime = elapseTime;
	}

	public void display() {
		String message = "Hour : " + getHour() + '\n' + "Minute :" + getMinute() + "\n" + "Seconds :" + getSeconds();
		System.out.println(message);
	}

}
