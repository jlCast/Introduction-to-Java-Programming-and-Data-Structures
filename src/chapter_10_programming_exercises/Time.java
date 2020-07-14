package chapter_10_programming_exercises;

public class Time {
	private long hour;
	private long minute;
	private long second;
	
	public Time() {
		long totalMilliseconds= System.currentTimeMillis();
		long totalSeconds=totalMilliseconds/1000;
		second=totalSeconds%60;
		long totalMinutes=(int)totalSeconds/60;
		minute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		hour=totalHours%24;		
	}
	public Time(long elapsed) {
		long totalSeconds=elapsed/1000;
		second=totalSeconds%60;
		long totalMinutes=(int)totalSeconds/60;
		minute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		hour=totalHours%24;		
	}	
	public Time(long hour, long minute, long second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public long getHour() {
		return hour;
	}
	public long getMinute() {
		return minute;
	}
	public long getSecond() {
		return second;
	}
	
	public void setTime(long elapsed) {
		long totalMilliseconds= System.currentTimeMillis();
		long elapsedTime=totalMilliseconds-elapsed;
		long totalSeconds=elapsedTime/1000;
		second=totalSeconds%60;
		long totalMinutes=(int)totalSeconds/60;
		minute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		hour=totalHours%24;
	}
}
