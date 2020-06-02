import java.util.Scanner;

class ScanningMethods 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("당신의 이름은? ");
		String str = keyboard.nextLine();
		System.out.println("안녕하세요" + str +'님');
		
		System.out.print("당신이 스파게티를 좋아 한다는데 진짜 입니까? ");
		boolean bol = keyboard.nextBoolean();
		if(bol == true)
		{
			System.out.println("오 좋아하는 군요");
		}else
		{
			System.out.println("아니군요");
		}
		
		System.out.print("당신과 동새의 키는? ");
		double num1 = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		double diff =num1 - num2;
		if(diff < 0)
		{
			System.out.println("동생이" + (-diff)+"만큼 더 크다");
		}else
		{
			System.out.println("당신이 더" + diff +"만큼 더 크다");
		}
		
	}
}
