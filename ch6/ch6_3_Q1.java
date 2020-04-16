
class ch6_3_Q1 {
    public static void main(String[]args)
    {
        int num = 2;
        int result = Squared(num);
        System.out.println(result);
    }
    public static int Squared(int num)
    {
        return (num == 1) ? 2 : 2 * Squared(num - 1);
    }
}