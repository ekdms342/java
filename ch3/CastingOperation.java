
class CastingOperation 
{
    public static void main (String [] args)
    {
        char ch1 ='A';
        char ch2 = 'Z';

        int num1 = ch1;
        int num2 = (int)ch2;

        System.out.println("문자A의 유니코드값 : " + num1 );
        System.out. println("문자 Z의 유니코드값 : " + num2);
    }
}