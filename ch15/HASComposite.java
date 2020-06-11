class Gun 
{
    int bullet;
    public Gun(int bnum){bullet = bnum;}
    public void shut()
    {
        System.out.println("BANG!");
        bullet--;
    }
}
class Police 
{
     int handcuffs;
     Gun pistol;

     public Police(int bnum, int bcuff)
     {
         handcuffs = bcuff;
         if(bnum != 0)
         {
             pistol = new Gun(bnum);
         }else
         {
            pistol = null;
         }
     }
     public void putHandcuff()
     {
         System.out.println("SANP!");
         handcuffs--;
     }
     public void shut()
     {
         if(pistol == null)
         {
             System.out.println("hut BBANG!");
         }else{
             pistol.shut();
         }
     }
}
class HASComposite 
{
    public static void main(String[]args)
    {
        Police haveGun = new Police(5, 3);
        haveGun.shut();
        haveGun.putHandcuff();

        Police donHaveGun = new Police(0,3);
        donHaveGun.shut();
    }    
}