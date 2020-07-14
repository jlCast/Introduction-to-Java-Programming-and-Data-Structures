package chapter_9_programming_exercises;

public class Rectangle {
	double width=1;
	double height=1;
	
	Rectangle(){		
	}
	Rectangle(double newWidth,double newHeight){
		width=newWidth;
		height=newHeight;
	}
	double getArea() {
		return width*height;
	}
	double getPerimeter() {
		return (width+height)*2;
	}
}
