

class Computer
{
    String owner;

    public Computer(String name){owner = name;}
    public void calculate(){System.out.println("요청 내용을 계산 합니다.");}
}
class NoteBookComp extends Computer
{
    int battary;

    public NoteBookComp(String name, int initChag)
    {
        super(name);
        battary = initChag;
    }
    public void charging()
    {
        battary += 5;
    }
    public void movingCal()
    {
        if(battary < 1)
        {
            System.out.println("충전이 필요합니다");
            return;
        }
        System.out.print("이동하면서");
        calculate();
        battary -= 1;
    }
}
class TableNotBook extends NoteBookComp
{
    String  regstPenModel;

    public TableNotBook(String name, int initChag, String pen)
    {
        super(name, initChag);
        regstPenModel = pen;
    }
    public void write(String penInfo)
    {
        if(battary < 1)
        {
            System.out.println("충전이 필요합니다.");
            return;
        }
        if(regstPenModel.compareToIgnoreCase(penInfo) != 0)
        {
            System.out.println("등록된 펜이 아닙니다.");
            return;
        }
        System.out.println("필기 내용을 처리합니다.");
        battary -= 1;
    }
}
class ISAlnheritance 
{
    public static void main (String[]args)
    {
        NoteBookComp nc = new NoteBookComp("이수종", 5);
        TableNotBook tn = new TableNotBook("전수영", 5 , "ISE-241-242");

        nc.movingCal();
        tn.write("ISE-241-242");
    }    
}