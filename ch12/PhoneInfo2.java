import java.util.Scanner;

class phoneInfoinput
{
	String name;
	String phoneNumber;
	String birthday;
	
	public int Choose()
	{
		int num;
		System.out.println("선택하시오");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		
		Scanner src = new Scanner(System.in);
		int choose = src.nextInt();
		return choose;
	}
	
	public PhoneInfo2 phoneInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		this.name = scan.nextLine();
		
		System.out.print("전화번호: ");
		this.phoneNumber = scan.nextLine();
		
		System.out.print("생일 : ");
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
		System.out.println("입력된 정보 출력....");
		System.out.println("이름:" + this.name);
		System.out.println("전화:" + this.phoneNumber);
		if(birthday.equals("0") == true )
		{
			System.out.println("생일 정보 없음" + '\n');
		}else
		{
			System.out.println("생일: " + this.birthday +'\n');
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
