
class ch5_7_Q2 {
    public static void main(String[]args)
    {
        for(int A = 0; A < 10 ; A++ )
        {
            for(int B = 0; B < 10 ; B++)
            {
                if((A + B) == 9)
                {
                    System.out.println("" + A + B + "+" + B + A + "=" + "99");
                }
            }
        }
    } 
}