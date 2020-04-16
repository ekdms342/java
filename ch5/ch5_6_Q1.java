class ch5_6_Q1 {
    public static void main (String[]args)
    {
        int count = 0;
        for( int num = 0; num++ < 100 ;count++)
        {
            if( num % 5 != 0 || num % 7 != 0)
            {
                continue;
            }
            System.out.println(num);
        }
        System.out.println("count: " + count);
    } 
}