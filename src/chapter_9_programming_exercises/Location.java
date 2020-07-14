package chapter_9_programming_exercises;

public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	public Location(int newRow, int newColumn, double newMaxValue) {
		row=newRow;
		column=newColumn;
		maxValue=newMaxValue;
	}
	public static String locateLargest(Location[][] newArray) {
		double largest=0;
		int rowLargest=0;
		int columnLargest=0;
		for(int i=0;i<newArray.length;i++) {
			for (int j=0;j<newArray[0].length;j++) {
				if(newArray[i][j].maxValue>largest) {
					largest=newArray[i][j].maxValue;
					rowLargest=newArray[i][j].row+1;
					columnLargest=newArray[i][j].column+1;
				}
			}
		}
		return "The location of the largest element is: "+largest+" at ("+rowLargest+","+columnLargest+").";
	}
}
