import java.util.Scanner;

class phoneInfoinput
{
	String name;
	String phoneNumber;
	String birthday;
	
	public int Choose()
	{
		int num;
		System.out.println("�����Ͻÿ�");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		
		Scanner src = new Scanner(System.in);
		int choose = src.nextInt();
		return choose;
	}
	
	public PhoneInfo2 phoneInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
		this.name = scan.nextLine();
		
		System.out.print("��ȭ��ȣ: ");
		this.phoneNumber = scan.nextLine();
		
		System.out.print("���� : ");
		this.birthday = scan.nextLine();	
		
		PhoneInfo2 Person = new PhoneInfo2(name, phoneNumber, birthday);
		return Person;
	}
	
	public void showInfo(PhoneInfo2 Person)
	{
		Person.showInfo();
	}
	
	
}

class PhoneInfo2
{
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo2(String name, String phoneNumber , String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public PhoneInfo2(String name, String phonNumber)
	{
		this(name, phonNumber,"0");
	}
	
	public void showInfo()
	{
		System.out.println("�Էµ� ���� ���....");
		System.out.println("�̸�:" + this.name);
		System.out.println("��ȭ:" + this.phoneNumber);
		if(birthday.equals("0") == true )
		{
			System.out.println("���� ���� ����" + '\n');
		}else
		{
			System.out.println("����: " + this.birthday +'\n');
		}
		
	}
	
	public static void main(String[] args)
	{
		PhoneInfo2 Person;
		int choose = 0;
		while(true)
		{
			phoneInfoinput input = new phoneInfoinput();
			choose = input.Choose();
			
			if(choose == 1)
			{
				Person = input.phoneInput();
				input.showInfo(Person);
			}else
			{
				break;
			}
			
		}
	}
	
}
