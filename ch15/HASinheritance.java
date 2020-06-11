class Gun
{
    int bullet;
    public Gun(int bnum)
    {
        bullet = bnum;
    }
    public void shut()
    {
        System.out.println("BBANG!");
        bullet--;
    }
    
} 
class Police extends Gun{
    int handcuffs;

    public Police(int bnum, int bcuff)
    {
        super(bnum);
        handcuffs = bcuff;
    }
    public void putHandcuff()
    {
        System.out.println("SNAP!");
        handcuffs--;
    }
}

class HASinheritance 
{
    public static void main(String [] args)
    {
        Police pman = new Police(5, 3);
        pman.shut();
        pman.putHandcuff();
    }    
}