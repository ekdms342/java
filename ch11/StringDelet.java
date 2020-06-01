class StringDelet 
{
	public static void main(String[]args)
	{
		String str = "990208-1012752";
		StringBuilder strBuf = new StringBuilder(str);
	
		int num = 0;
		num = strBuf.lastIndexOf("-");
		strBuf.deleteCharAt(num);
		System.out.println(strBuf);
		
	}
	
}
