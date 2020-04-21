class ch7_1_Q1
{
	public static void main(String[] args)
	{
		Triangle tri = new Triangle(3,4);
		tri.showUnderHeight();
		tri.changeUnderHeight(12.5,4);
		tri.showUnderHeight();
		System.out.println("triangleSize: " + tri.triangleSize());
		
	}

}

class Triangle
{
	double Under;
	double Height;
	public Triangle(double under, double height)
	{
		Under = under;
		Height = height;
	}
	
	public void changeUnderHeight(double under, double height)
	{
		Under = under;
		Height = height;
	}

	public double triangleSize()
	{
		return (Under*Height)/2;
	}

	public void showUnderHeight()
	{
		System.out.println("Under :" +Under + "Height : " +Height);
	}

}	