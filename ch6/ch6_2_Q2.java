
class ch6_2_Q2 {
    public static void main (String[]ags)
    {
        int num = 1;
        boolean primenum;
        while(num <= 100)
        {
            primenum = primeNum(num);
            if(primenum == true)
            {
              System.out.println(num + "은 소수이다");  
            }
            
            num++;
        }
    }
    public static boolean primeNum (int num)
    {
        int noprime = 0;
        for (int  i = 2; i < 10 ; i++)
        {
            if(num % i == 0 && num != i)
            {
                noprime = 1;
                break;
            }
        }
        if(noprime == 1)
        {
            return false;
        }else
        {
            return true;
        }
    }
}