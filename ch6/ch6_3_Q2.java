
class ch6_3_Q2 {
    public static void main(String[]args)
    {
        int num = 12;
        TenToTwo(num);
    } 
    public static void TenToTwo(int num)
    {
        if(num == 0)
        {
            return;    
        }
        TenToTwo(num/2);
        System.out.println (num % 2);
        
    }
}