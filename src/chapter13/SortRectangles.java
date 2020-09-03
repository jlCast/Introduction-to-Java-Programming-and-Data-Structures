package chapter13;

import java.util.Arrays;

public class SortRectangles {

	public static void main(String[] args) {
		ComparableRectangle[] rectangles = {
				new ComparableRectangle(3.4,5.4),
				new ComparableRectangle(13.24,55.4),
				new ComparableRectangle(7.4,35.4),
				new ComparableRectangle(1.4,25.4)};
	Arrays.sort(rectangles);
	for(Rectangle r:rectangles) {
		System.out.print(r+" ");
		System.out.println();
	}
	}
}