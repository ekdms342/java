
class ch5_6_Q2 {
    public static void main(String[]args)
    {
        int num1 = 1;
        int result = 0;
        while(true)
        {
            if((num1 % 2) != 0)
            {
                result += num1; 
            }else 
            {
                if(num1 % 3 == 0)
                {
                    result += num1;
                }
            } 
            if(result > 1000)
            {
                System.out.println(num1);
                break;
            }
            num1++;
        }
        System.out.println(result);
    } 
}