
class ch4_2_Q3 {
    public static void main (String[]args)
    {
        byte num1 = 127;
        byte num2 = -128;

        num1 <<= 1;
        num2 <<= 1;
        
        System.out.println(num1);
        System.out.println(num2);
    }
}