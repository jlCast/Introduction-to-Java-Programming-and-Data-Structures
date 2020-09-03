package chapter13;

public class ComparableRectangle extends Rectangle implements Comparable<GeometricObject>{
	
	public ComparableRectangle (double width, double height){
		super(width,height);
	}
	@Override
	public int compareTo (GeometricObject o) {
		if(getArea()<o.getArea())
			return -1;
		else if(getArea()>o.getArea())
			return 1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return super.toString()+". Area: "+getArea();
	}	
}
