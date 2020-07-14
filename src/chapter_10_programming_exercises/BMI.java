package chapter_10_programming_exercises;

public class BMI {
	private String name;
	private int age;
	private double weight;//(pounds)
	private double height;//(inches)
	public static final double KILOGRAMS_PER_POUND=0.45359237;
	public static final double METERS_PER_INCH=0.0254;
	
	public BMI(String name,int age,double weight,double height) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;			
	}
	public BMI(String name,double weight,double height) {
		this(name,20,weight,height);
	}
	public BMI(String name,int age,double weight,double feet, double inches) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		height=feet*12+inches;
	}
	public double getBMI() {
		double BMI=(weight*KILOGRAMS_PER_POUND)/(Math.pow(height*METERS_PER_INCH,2));
		return Math.round(BMI*100)/100.0;
	}
	public String getStatus() {
		double bmi=getBMI();
		if(bmi<18.5)
			return "Underweight";
		else if (bmi<25)
			return "Normal";
		else if (bmi<30)
			return "Overweight";
		else
			return "Obese";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;		
	}	
	public double getHeight() {
		return height;
	}
}
