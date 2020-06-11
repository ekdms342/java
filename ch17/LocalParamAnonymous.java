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
    public Readable CLCI(final int instID)
    {
        return new Readable()
        {
             public void read()
            {
                System.out.println(" outer inst name : " + myName);
                System.out.println("Local inst ID :" + instID);
            }
        };
        
    }
}
class LocalParamAnonymous {
    public static void main(String[] args) {
        OuterClass out1 = new OuterClass("My Outer class");
        Readable localInst1 = out1.CLCI(111);
        localInst1.read();

        Readable localInst2 = out1.CLCI(222);
        localInst2.read();
    }
    
}
