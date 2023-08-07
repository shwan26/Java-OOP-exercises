package Time1_8;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public Time nextSecond() {
		second+=1;
		if (second >= 60) {
			second = second%60;
			minute +=1;
		}
		if (minute >= 60) {
			minute = minute%60;
			hour+=1;
		}
		if (hour >= 24) {
			hour = hour%24;
		}
		return this;
	}
	
	public Time previousSecond() {
		second-=1;
		if (second < 0) {
			second = 59;
			minute-=1;
		}
		if (minute < 0) {
			minute = 59;
			hour-=1;
		}
		if (hour < 0) {
			hour = 23;
		}
		return this;
	}
}
