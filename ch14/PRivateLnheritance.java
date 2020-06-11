
class Accuumlator
{
    private int val;
    public Accuumlator(int init)
    {
        val = init;
    }
    protected void accumulate(int num)
    {
        if(num<0)
        {
            return;
        }
        val += num;
    }
    protected int getAccVal(){return val;}
}
class SavingAccount extends Accuumlator
{
    public SavingAccount(int initDep)
    {
        super(initDep);
    }
    public void saveMoney(int money)
    {
        accumulate(money);
    }
    public void showSaveMoney()
    {
        System.out.print("지금까지의 누적금액 :");
        System.out.println(getAccVal());
    }
}

class PRivateLnheritance 
{
    public static void main(String[]args)
    {
        SavingAccount sa = new SavingAccount(1000);
        sa.saveMoney(1000);
        sa.saveMoney(1000);
        sa.showSaveMoney();
    }
}