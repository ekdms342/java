class OuterClassONe
{
    OuterClassONe()
    {
        NestedClass nst = new NestedClass();
        nst.SimpleMethod();
    }

    static class NestedClass
    {
        public void SimpleMethod()
        {
            System.out.println("Nested Instance Method One");
        }
    }
}

class OuterClassTwo
{
    OuterClassTwo()
    {
        NestedClass nst =new NestedClass();
        nst.SimpleMethod();
    }

    private static class NestedClass
    {
        public void SimpleMethod()
        {
            System.out.println("Nested Instance Method Two");
        }
    } 
}
class NestedClassTest 
{
    public static void main(String[] args) 
    {
        OuterClassONe one =new OuterClassONe();
        OuterClassTwo two = new OuterClassTwo();
        
        OuterClassONe.NestedClass nst1 = new OuterClassONe.NestedClass();
        nst1.SimpleMethod();
    }    
}