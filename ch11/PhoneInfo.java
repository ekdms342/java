class PhoneInfo 
{
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo(String name, String phoneNumber , String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public PhoneInfo(String name, String phonNumber)
	{
		this(name, phonNumber,"0");
	}
	
	public void showInfo()
	{
		System.out.println("이름:" + this.name);
		System.out.println("핸드폰 번호:" + this.phoneNumber);
		if(birthday.equals("0") == true )
		{
			System.out.println("생일 정보 없음" + '\n');
		}else
		{
			System.out.println("생일: " + this.birthday +'\n');
		}
		
	}
	public static void main(String[]args)
	{
		PhoneInfo Person1 = new PhoneInfo("강다은","010-1111-1111","2000.01.07");
		PhoneInfo Person2 = new PhoneInfo("강다영","010-1111-1111");
		
		Person1.showInfo();
		Person2.showInfo();
		
	}
}
