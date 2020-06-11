interface Readable
{
    public void read();
}
class OuterClass
{
    private String myName;

    OuterClass(String name)
    {
        myName = name;
    }
    public Readable CLCI()
    {
        class LocalClass implements Readable
        {
            public void read()
            {
                System.out.println(" outer inst name : " + myName);
            }
        }
        return new LocalClass();
    }
}
class LocalClassTest {
    public static void main(String[] args) {
        OuterClass out1 = new OuterClass("Frist");
        Readable localInst1 = out1.CLCI();
        localInst1.read();

        OuterClass out2 = new OuterClass("Second");
        Readable localInst2 = out2.CLCI();
        localInst2.read();
    }
    
}