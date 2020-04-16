
class ch6_2_Q1 {
    public static void main( String[]args)
    {
        int rad = 3;
        double result = Area(rad);
        double fit = Fit(rad);
        System.out.println(result);
        System.out.println(fit);
    }

    public static double Area (int rad1)
    {
        return rad1*rad1*3.14;
    }

    public static double Fit(int rad)
    {
        return rad * 2 * 3.14;
    }
}