class changeArray 
{
	public void changarr(int[][]ar)
	{
		int[] arre = ar[ar.length - 1];
		for(int i = ar.length - 1 ; i > 0; i--)
		{
			ar[i] = ar[i - 1];
		}
		ar[0] = arre;
	}
	
	public void showarr(int[][] arr)
	{
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++ )
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10,11,12} };
		changeArray ca = new changeArray();
		ca.changarr(arr);
		ca.showarr(arr);
		
	}
}
