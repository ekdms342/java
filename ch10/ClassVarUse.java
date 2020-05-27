class Circle
{
	static final double PI = 3.1415;
	private double radius;
	
	public Circle(double rad) { radius = rad;}
	public void showPerimeter()
	{
		double peri = (radius*2)*PI;
		System.out.println("µ—∑π: " +peri);
	}
	
	public void showArea()
	{
		double area = (radius*radius)*PI;
		System.out.println("≥–¿Ã:" +area);
		
	}
}

class ClassVarUse {
	public static void main(String[]args)
	{
		Circle cl = new Circle(1.2);
		cl.showPerimeter();
		cl.showArea();
	}
}
