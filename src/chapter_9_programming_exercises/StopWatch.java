package chapter_9_programming_exercises;

public class StopWatch {
	
	public StopWatch() {
	}
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void start() {
		startTime=System.currentTimeMillis();		
	}
	public void stop() {
		endTime=System.currentTimeMillis();		
	}
	public long getElapsedTime(){
		return endTime-startTime;
	}	
	
	private long startTime=System.currentTimeMillis();
	private long endTime=startTime;
}
