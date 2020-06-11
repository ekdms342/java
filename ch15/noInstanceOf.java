class Box
{
    public void wrap() {System.out.println("simple wrap");}
}    
class PaperBox extends Box
{
    public void wrap()
    {
        System.out.println("paper wrap");
    }
}

class GoldPaperBox extends PaperBox
{
    public void wrap()
    {
        System.out.println("gold wrap");
    }
}
class noInstanceOf {
    public static void wrapBox(Box box)
    {
        box.wrap();
    }
    public static void main(String[] args)
    {
        Box box1 =new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }
}