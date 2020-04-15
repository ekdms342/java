
class ch4_1_Q5 {
    public static void main(String[]args)
    {
        int A,B,C;
        boolean result1, result2;
        A = 25+5;
        A += (36/4);
        A -= 72;
        A *=5;

        B = 25*5;
        B += 36-4;
        B += 71;
        B /= 4;

        C = 128/4;
        C *= 2;

        result1 = B > C;
        result2 = A > B;
        System.out.println(result1 && result2);
    }
}