class addTwoArray 
{
	public static void addTwoDArray(int[][] arr , int add)
	{
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++ )
			{
				arr[i][j] += add;
			}
		}
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
		int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		addTwoArray add = new addTwoArray();
		add.addTwoDArray(arr, 1);
		add.showarr(arr);
		
	}
}
