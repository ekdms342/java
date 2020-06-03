import java.util.Scanner;

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
		System.out.println("name:" + this.name);
		System.out.println("phone:" + this.phoneNumber);
		if(birthday.equals("0") == true )
		{
			System.out.println("no Data" + '\n');
		}else
		{
			System.out.println("birtday: " + this.birthday +'\n');
		}
	}
}

class phoneBookchose
{
	String name;
	String phoneNumber;
	String birthday;
	
	public int Choose()
	{
		int num;
		System.out.println("선택하세요...");
		System.out.println("1. Data Save");
		System.out.println("2. Data Search");
		System.out.println("3. Data Delete");
		System.out.println("4. exit");
		
		Scanner src = new Scanner(System.in);
		int choose = src.nextInt();
		return choose;
	}
}
class phoneBookSave
{
	String name;
	String phoneNumber;
	String birthday;
	
	public phoneBookSave (PhoneInfo[] arr, int arrindex)
	{
		this.phoneInput();
		PhoneInfo Person = new PhoneInfo(name, phoneNumber, birthday);
		
		arr[arrindex] = Person;
	}
	
	public void phoneInput()
	{
		System.out.println("데이터 입력을 시작 합니다");
		Scanner scan = new Scanner(System.in);
		System.out.print("name: ");
		this.name = scan.nextLine();
		
		System.out.print("phone: ");
		this.phoneNumber = scan.nextLine();
		
		System.out.print("birthday: ");
		this.birthday = scan.nextLine();
		
	}
	
	public void showInfo(PhoneInfo Person)
	{
		Person.showInfo();
	}
	
}

class phoneBookDelete
{
	public phoneBookDelete(PhoneInfo[] arr, String name,int arrindex)
	{
		for(int i = 0 ; i < arrindex ; i++)
		{
			if(arr[i].name.equals(name))
			{
				for(int j = i ; j < arr.length - 1 ; j++)//생각
				{
					arr[j] = arr[j + 1]; 
					break;
				}
				
			}
		}
	}
}

class phoneBooksearch
{
	public phoneBooksearch(PhoneInfo[] arr, String name, int arrindex)
	{
		for(int i = 0 ; i < arrindex ; i++)
		{
			if(arr[i].name.equals(name))
			{
				arr[i].showInfo();
				break;
			}
		}
	}
}

public class PhoneBook3 
{
	public static void main(String[]args)
	{
		int arrindex = 0;
		int ch = -1;
		PhoneInfo[] arr = new PhoneInfo[100];
		phoneBookchose chose = new phoneBookchose();
		
		Scanner scan = new Scanner(System.in);
		
		while(arrindex < 100)
		{
			ch= chose.Choose();
			
			if(ch == 1)
			{
				phoneBookSave save = new phoneBookSave(arr,arrindex);
				arrindex++;
				
				for(int i = 0; i<arr.length; i++)
				{
					System.out.print(arr[i]);
				}
			}else if(ch == 2)
			{
				String name;
				name = scan.nextLine();
				phoneBooksearch search = new phoneBooksearch(arr,name,arrindex);
				
			}else if(ch == 3)
			{
				String name;
				name = scan.nextLine();
				phoneBookDelete delete = new phoneBookDelete(arr, name,arrindex);
				arrindex--;
				
			}else if(ch == 4)
			{
				break;
				
			}else if(ch == -1)
			{
				System.out.println("error");
				System.exit(0);
			}else
			{
				System.out.println("error");
				System.exit(0);
			}
		}
		
	}
}
