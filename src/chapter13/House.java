package chapter13;

import java.util.Date;

public class House implements Comparable<House>, Cloneable {
	private int id;
	private double area;
	private Date whenBuilt;

	public House(int id, double area) {
		this.id=id;
		this.area=area;
		whenBuilt=new Date();
	}
	public int getId() {
		return id;
	}
	public double getArea() {
		return area;
	}
	public Date getWhenBuilt() {
		return whenBuilt;
	}
	@Override //implementamos el método compareTo definido en la interfaz Comparable
	public int compareTo(House o) {
		if(area>o.area)
			return 1;
		else if(area<o.area)
			return -1;
		else
			return 0;
	}
	@Override //Sobrescribimos el metodo protected clone definido en la clase Object
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}	
}
