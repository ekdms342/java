import java.util.Scanner;

interface Week
{int MON =1 , TUE = 2, WED = 3, THU = 4, FRI = 5 , SAT = 6, SUN = 7;}
class MeaningfulConst {
    public static void main(String[]args)
    {
        System.out.println("오늘의 요일을 선택하시오");
        System.out.println("1.월요일 2. 화요일 3. 수요일 4.목요일 5. 금요일 6. 토요일 7. 일요일");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        int sel = sc.nextInt();

        switch(sel)
        {
        case Week.MON :
            System.out.println("주간 회의");
            break;
        case Week.TUE :
            System.out.println("기확 회의");
            break;
        case Week.WED :
            System.out.println("보고");
            break;
        case Week.THU :
            System.out.println("축구");
            break;
        case Week.FRI:
            System.out.println("마감");
            break;
        case Week.SAT :
            System.out.println("가족");
            break;
        case Week.SUN :
            System.out.println("휴일");
            break;
        }

    }
    
}