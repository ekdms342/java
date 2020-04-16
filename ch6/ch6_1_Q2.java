
class ch6_1_Q2 {
    public static void main(String[]args)
    {
        int num1 = 13 , num2 = 14;

        AbV(num1 , num2);
    } 
    public static void AbV(int num1, int num2)
    {
        if(num1 > num2)
        {
            System.out.println(num1 - num2);
        }else 
        {
            System.out.println(num2 - num1);
        }
    }
}