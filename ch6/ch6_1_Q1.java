
class ch6_1_Q1 {
    public static void main(String[]args)
    {
        int num1 = 12 , num2 = 3;
        
        FAO(num1,num2);
    }
    public static void FAO (int num1, int num2)
    {
        System.out.println("덧셈:" + (num1 + num2));
        System.out.println("곱셈: " + (num1* num2));
        System.out.println("나눗셈 몫:"+ (num1/num2) + " 나머지:" + (num1 % num2));
    }
}