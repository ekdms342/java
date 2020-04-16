
class InfRecul {
    public static void main(String[]args)
    {
        showHi(3);
    } 

    public static void showHi(int num)
    { 
        if(num == 1)
        {
            return;
        }
        System.out.println("Hi~");
        showHi(--num);
       
    }
}