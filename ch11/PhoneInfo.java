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
		System.out.println("�̸�:" + this.name);
		System.out.println("�ڵ��� ��ȣ:" + this.phoneNumber);
		if(birthday.equals("0") == true )
		{
			System.out.println("���� ���� ����" + '\n');
		}else
		{
			System.out.println("����: " + this.birthday +'\n');
		}
		
	}
	public static void main(String[]args)
	{
		PhoneInfo Person1 = new PhoneInfo("������","010-1111-1111","2000.01.07");
		PhoneInfo Person2 = new PhoneInfo("���ٿ�","010-1111-1111");
		
		Person1.showInfo();
		Person2.showInfo();
		
	}
}
