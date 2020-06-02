class EnhancedFor 
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
	
		int sum = 0;
		for(int e : arr)
		{
			sum += e;
		}
		System.out.printf("배열 요소의 합: %d \n",sum);
		
		for(int e: arr)
		{
			e++;
			System.out.print(e + " ");
		}
		
		System.out.println("");
		for(int e : arr)
		{
			System.out.print(e + " ");
		}
	}
	
}
