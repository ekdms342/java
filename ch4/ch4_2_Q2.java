
class ch4_2_Q2 {
    public static void main(String[]args)
    {
        int num1 = 15678;
        int bit3;
        int bit5;
        num1 /= 2;
        num1 /= 2;
        bit3 = num1 % 2;
        num1 /= 2;
        num1 /= 2;
        bit5 = num1 %2;


        System.out.println(bit3);
        System.out.println(bit5);
    } 
}