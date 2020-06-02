class BigSmall 
{
	public static int minValue(int[] ar)
	{
		int min = ar[0];
		for(int i = 1 ; i < ar.length ; i++)
		{
			if(ar[i] < min)
			{
				min = ar[i];
			}
		}
		return min;
	}
	
	public static int maxValue(int[] ar)
	{
		int max = ar[0];
		for(int i = 1 ; i < ar.length ; i++)
		{
			if(ar[i] > max)
			{
				max = ar[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[]args)
	{
		int[] arr = {1, 2, 10, 4, 0, 6};
		BigSmall bigsmall = new BigSmall();
		int Min = bigsmall.minValue(arr);
		int Max = bigsmall.maxValue(arr);
		
		System.out.println("Min:" + Min +" " + "Max:" + Max);
	}
}
