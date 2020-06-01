class StringReverse {
	public static void main(String[]args)
	{
		String str = "ABCDEFGHIJKLMN";
		
		StringBuilder strBuf = new StringBuilder(str);
		System.out.println(strBuf);
		strBuf.reverse();
		System.out.println(strBuf);
	}

}
