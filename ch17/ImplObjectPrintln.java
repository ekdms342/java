class ClassPrinter
{
    public static void print(Object obj){System.out.println(obj.toString());}
}

class Point 
{
    private int xpos, ypos;

    Point (int x, int y)
    {
        xpos = x;
        ypos = y;
    }
    public String toString()
    {
        String posINfo = "[x : " + xpos + ", y :" +ypos+ "]";
        return posINfo;
    }
}
class ImplObjectPrintln 
{
     public static void main(String[] args) 
     {
        Point pos1 = new Point(1,2);
        Point pos2 = new Point(5,9);
        
        ClassPrinter.print(pos1);
        ClassPrinter.print(pos2);
        

    }    
}