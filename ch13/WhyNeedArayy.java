import java.util.Scanner;

class WhyNeedArayy {
	public static void main(String[] args)
	{
		int first = 0;
		int second = 0;
		
		Scanner scan = new Scanner(System.in);
		int score1 = scan.nextInt();
		if(score1 > first)
		{
			first = score1;
			System.out.println(""+ first+" " + second);
		}else if(score1 > second)
		{
			System.out.println(""+ first + " " + second);
		}
		
		int score2 = scan.nextInt();
		if(score2 > first)
		{
			second = first;
			first = score2;
			System.out.println(""+ first+" " + second);
		}else if(score2 > second)
		{
			second = score2;
			System.out.println(""+ first+ " " + second);
		}
		
		int score3 = scan.nextInt();
		if(score3> first)
		{
			second = first;
			first = score3;
			System.out.println(""+ first+" " + second);
		}else if(score3 > second)
		{
			second = score3;
			System.out.println(""+ first+ " " + second);
		}
		
		
		int score4 = scan.nextInt();
		if(score4> first)
		{
			second = first;
			first = score4;
			System.out.println(""+ first+" " + second);
		}else if(score4 > second)
		{
			second = score4;
			System.out.println(""+ first+ " " + second);
		}
		
		int score5 = scan.nextInt();
		if(score5> first)
		{
			second = first;
			first = score5;
			System.out.println(""+ first+" " + second);
		}else if(score5 > second)
		{
			second = score5;
			System.out.println(""+ first+ " " + second);
		}		
		int score6 = scan.nextInt();
		
		if(score6> first)
		{
			second = first;
			first = score6;
			System.out.println(""+ first+" " + second);
		}else if(score6 > second)
		{
			second = score6;
			System.out.println(""+ first+ " " + second);
		}
		
	}
}
