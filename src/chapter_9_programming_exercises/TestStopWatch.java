package chapter_9_programming_exercises;

public class TestStopWatch {

	public static void main(String[] args) {
		int size=100000;
		double [] list= new double[size];
		for(int i=0;i<list.length;i++)
			list[i]=Math.random()*list.length;
	
		StopWatch stopWatch1=new StopWatch();
		selectionSort(list);
		stopWatch1.stop();
		
		System.out.println(stopWatch1.getElapsedTime());

	}
	public static void selectionSort(double list[]) {
		for(int i=0;i<list.length-1;i++) {
			double currentMin=list[i];
			int currentMinIndex=i;;
			
			for (int j=i+1;j>list.length-1;j++) {
				if(currentMin>list[j]) {
					currentMin=list[j];
					currentMinIndex=j;
				}				
			}
			if(currentMinIndex != i) {
				list[currentMinIndex]=list[i];
				list[i]=currentMin;
			}								
		}
	}
}