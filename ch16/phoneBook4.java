import java.util.Scanner;

class PhoneInfo 
{
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo()
	{
		System.out.println("name:" + this.name);
		System.out.println("phone:" + this.phoneNumber);
	}
}
class UnivPhoneInfo extends PhoneInfo
{
    String major;
    int year;

    public UnivPhoneInfo(String name, String phoneNumber, String major, int year)
    {
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }
    public void showInfo()
    {
        super.showInfo();
        System.out.println("major :" + major);
        System.out.println("Year : " + year);
    }
}
class companyPhoneInfo extends PhoneInfo
{
    String company;

    public companyPhoneInfo(String name ,String phoneNumber, String company)
    {
        super(name, phoneNumber);
        this.company = company;
    }

    public void showInfo()
    {
        super.showInfo();
        System.out.println("company : " +company);
    }
}

class phoneBookchose
{
	String name;
	String phoneNumber;
	
	public int Choose()
	{
		int num;
		System.out.println("선택하시오...");
		System.out.println("1. Data Save");
		System.out.println("2. Data Search");
		System.out.println("3. Data Delete");
        System.out.println("4. exit");
        System.out.println("choose>> ");
		
        Scanner src = new Scanner(System.in);
		int choose = src.nextInt();
		return choose;
	}
}
class phoneBookSave
{
	String name;
    String phoneNumber;
    String major;
    int year;
    String company;
    PhoneInfo Person;
    
	public phoneBookSave (PhoneInfo[] arr, int arrindex,int ch2)
	{
        this.phoneInput(ch2);
		arr[arrindex] = Person;
	}
	
	public void phoneInput(int ch2)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("name: ");
		this.name = scan.nextLine();
		
		System.out.print("phone: ");
        this.phoneNumber = scan.nextLine();
        if(ch2 == 1)
        {
            Person = new PhoneInfo(name, phoneNumber);
        }
        else if(ch2 == 2)
        {
            System.out.print("major:");
            this.major = scan.nextLine();

            System.out.println("year:");
            this.year = scan.nextInt();

            Person = new UnivPhoneInfo(name, phoneNumber, major, year);
        }else if( ch2 == 3)
        {
            System.out.print("company: ");
            this.company = scan.nextLine();

            Person = new companyPhoneInfo(name, phoneNumber, company);
        }
		
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
				for(int j = i ; j < arr.length - 1 ; j++)//����
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

public class phoneBook4
{
	public static void main(String[]args)
	{
		int arrindex = 0;
        int ch = -1;
        int ch2 = -1;
		PhoneInfo[] arr = new PhoneInfo[100];
		phoneBookchose chose = new phoneBookchose();
		
		Scanner scan = new Scanner(System.in);
		
		while(arrindex < 100)
		{
			ch= chose.Choose();
			
			if(ch == 1)
			{
                System.out.println("데이터 입력을 시작 합니다...");
                System.out.println("1.일반, 2. 대학, 3. 회사");
                Scanner sc = new Scanner(System.in);
                ch2 = sc.nextInt();
				phoneBookSave save = new phoneBookSave(arr,arrindex,ch2);
                arrindex++;
                
				
				/*for(int i = 0; i<arr.length; i++)
				{
					System.out.print(arr[i]);
				}*/
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
