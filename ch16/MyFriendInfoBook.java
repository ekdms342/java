import java.util.Scanner;

class Friend
{
    String name;
    String phoneNUm;
    String addr;

    public Friend(String name, String phone, String addr)
    {
        this.name = name;
        this.phoneNUm = phone;
        this.addr = addr;
    }
    public void showData()
    {
        System.out.println("이름 :" +name);
        System.out.println("전화 : "+ phoneNUm);
        System.out.println("주소 :" +addr);
    }
    public void showBasicInfo(){}
}

class HighFriend extends Friend{
    String work;
    public HighFriend (String name, String phone, String addr, String work)
    {
        super(name, phone, addr);
        this.work = work;
    }
    public void showData()
    {
        super.showData();
        System.out.println("직업 :" +work);
    }
    public void showBasicInfo()
    {
        System.out.println("이름 :" +name);
        System.out.println("전화 :" + phoneNUm);
    }
}
class UnivFriend extends Friend
{
    String major;
    public UnivFriend(String name, String phone, String addr, String major)
    {
        super(name, phone, addr);
        this.major = major;
    }
    public void showData()
    {
        super.showData();
        System.out.println("전공 :" +major);
    }
    public void showBasicInfo()
    {
        System.out.println("이름 :" +name);
        System.out.println("전화 :" + phoneNUm);
        System.out.println("전공 :" +major);
    }
}
class FriendInfoHandler
{
    private Friend[] myFriends;
    private int numOfFriends;

    public FriendInfoHandler(int num)
    {
        myFriends = new Friend[num];
        numOfFriends = 0;
    }

    private void addFriendInfo(Friend fren)
    {
        myFriends[numOfFriends++] = fren;
    }

    public void addFriend(int choice)
    {
        String name, phoneNUm, addr, job, major;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : "); name = sc.nextLine();
        System.out.print("전화 : "); phoneNUm = sc.nextLine();
        System.out.print("주소 : "); addr = sc.nextLine();

        if(choice == 1)
        {
            System.out.print("직업:"); job = sc.nextLine();
            addFriendInfo(new HighFriend(name, phoneNUm, addr, job));
        }else{
            System.out.print("학과 : "); major = sc.nextLine();
            addFriendInfo(new UnivFriend(name, phoneNUm, addr, major));
        }
        System.out.println("입력 완료! \n");
    }

    public void showAllData()
    {
        for(int i = 0; i < numOfFriends ; i++)
        {
            myFriends[i].showData();
            System.out.println("");
        }
    }

    public void showAllSimpleData()
    {
        for(int i = 0; i < numOfFriends ; i++)
        {
            myFriends[i].showBasicInfo();
            System.out.println("");
        }
    }
}
class MyFriendInfoBook 
{
    public static void main(String [] args)
    {
        FriendInfoHandler handler = new FriendInfoHandler(10);

        while(true)
        {
            System.out.println("*** 메뉴 선택***");
            System.out.println("1.고교동창 정보 저장");
            System.out.println("2.대학 친구 정조 저장");
            System.out.println("3. 전체 정보 출력");
            System.out.println("4. 기본 정보 출력");
            System.out.println("5. 프로 그램 종료");
            System.out.print("선택 >>");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1 : case 2:
                handler.addFriend(choice);
                case 3:
                handler.showAllData();
                break;
                case 4:
                handler.showAllSimpleData();
                case 5:
                System.out.println("프로그램을 종료 합니다");
                return;
            }

        }
    }
}