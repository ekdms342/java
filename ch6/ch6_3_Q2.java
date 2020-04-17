class ch6_3_Q2 {
    public static void main(String[]args)
    {
        int num = 4;
        System.out.println(TenToTwo(num));
        
    } 
    public static String TenToTwo(int num)
    {
        return (num == 0) ? "" : TenToTwo(num/2)+(num % 2);
    }
}