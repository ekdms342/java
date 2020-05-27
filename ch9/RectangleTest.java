
class Rectangle
{
	private int ulx,uly;
	private int lrx,lry;
	
	public void set_Ul(int set_ulx , int set_uly)
	{
		ulx = set_ulx;
		uly = set_uly;
	}
	
	public void set_lr(int set_lrx , int set_lry)
	{
		lrx = set_lrx;
		lry = set_lry;
	}
	
	public void setValue (int ulx , int uly, int lrx, int lry)
	{
		if( (0 <= ulx && ulx <= 100) && (0 <= lrx && lrx <= 100) )
		{
			if( (0 <= uly && uly <= 100) && (0 <= lry && lry <= 100) )
			{
				if(ulx < lrx && lry > uly)
				{
					set_Ul(ulx,uly);
					set_lr(lrx,lry);
				}
			}
			
		}
	}
	
	public void showArea() 
	{
		int xLen = lrx-ulx;
		int yLen = lry-uly;
		System.out.println("≥–¿Ã: " +(xLen *yLen));
	}
}

class RectangleTest 
{
	public static void main (String[] args)
	{
		Rectangle rec = new Rectangle();
		rec.setValue(10, 10 ,22 ,22);
		rec.showArea();
	}
}
