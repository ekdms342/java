class Employer
{
	private int myMoney;
	
	public Employer(int money)
	{
		myMoney = money;
	}
	
	public void payForWork(Employee emp, int money)
	{
		if(myMoney <money)
		{
			return;
		}
		emp.earnMoney(money);
		myMoney -= money;
	}
	public void showMyMoney()
	{
		System.out.println(myMoney);
	}
}

class Employee
{
	private int myMoney;
	
	public Employee(int money)
	{
		myMoney = money; 
	}
	public void earnMoney(int money)
	{
		myMoney += money;
	}
	public void ShowMoney() 
	{
		System.out.println(myMoney);
	}
	
	
}

class NoMainClass{
	public static void main(String[]args)
	{
		Employer emr = new Employer(3000);
		Employee eme = new Employee(0);
		
		emr.payForWork(eme, 1000);
		emr.showMyMoney();
		eme.ShowMoney();
	}
}
