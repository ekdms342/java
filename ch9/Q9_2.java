class Point 
{
	int xPos, yPos;
	public Point (int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public void showPointInfo()
	{
		System.out.println("[" + xPos+ "," + yPos + "]");
	}
}

class Circle 
{
	Point point;
	int rad;
	
	public Circle(int x, int y, int radi) 
	{
		point = new Point(x, y);
		rad = radi;
	}
	public void ShowCircleInfo()
	{
		System.out.println("radius :" + rad);
		point.showPointInfo();
	}
}

class Ring
{
	Circle incircle;
	Circle outcircle;
	
	public Ring(int inx, int iny, int inrad , int outx, int outy,int outrad)
	{
		incircle = new Circle(inx, iny, inrad);
		outcircle = new Circle(outx, outy, outrad);
		
	}
	
	public void showRingInfo()
	{
		System.out.println("Inner Cicle INfo...");
		incircle.ShowCircleInfo();
		System.out.println("Outter Circle Info...");
		outcircle.ShowCircleInfo();
	}
}

public class Q9_2 {
	
	public static void main (String[]args)
	{
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}

}
