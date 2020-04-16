
class ch5_4_Q3 {
    public static void main(String[]args)
    {
        int num = 1;
        int result = 0;

        while(num <= 1000)
        {
            if((num % 2 ) == 0 && (num % 7) == 0)
            {
                System.out.println("2의 배수이면서 7의 배수: " + num);
                result += num;
            }
            num++;
        }
        System.out.println(result);
    } 
}