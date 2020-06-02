class InstanceArray 
{
	public static void main(String[] args)
	{
		String[] arr = new String[3];
		arr[0] = new String("java");
		arr[1] = new String("flex");
		arr[2] = new String("ruby");
		
		for(int i = 0; i < 3 ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
