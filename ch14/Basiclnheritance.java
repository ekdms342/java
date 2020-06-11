class Man
{
	private String name;
	public Man(String name) {this.name =name;}
	public void tellYourName() {System.out.println("My name is " + name);}
}

class BusinessMan extends Man
{
	private String company;
	private String position;
	public BusinessMan (String name, String company, String position)
	{
		super(name);
		this.company = company;
		this.position = position;
		
	}
	public void tellYourInfo()
	{
		System.out.println("MY company is" + company);
		System.out.println("My position is"+ position);
		tellYourName();
	}
}
class Basiclnheritance 
{
	public static void main(String[]args)
	{
		BusinessMan man1 = new BusinessMan("Mr. Hong", "Hybrid ", "staff");
		BusinessMan man2 = new BusinessMan("Mr kim", "HYbrid", "ceo");
		
		System.out.println("Frist man info........");
		man1.tellYourName();
		man1.tellYourInfo();
		System.out.println("Second man info........");
		man2.tellYourInfo();
	}
}
