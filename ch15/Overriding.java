import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

class Spker
{
    private int volumeRate;

    public void showCurrentState()
    {
        System.out.println("볼륨 크기: "+volumeRate);
    }
    public void setVolume(int vol)
    {
        volumeRate = vol;
    }
}

class BaseEnSpker extends Spker
{
    private int baseRate;

    public void showCurrentState()
    {
        super.showCurrentState();
        System.out.println("베이스의 크기 :" +baseRate);
    }
    public void setBaseRate(int base)
    {
        baseRate = base;

    }
}

class Overriding
{
    public static void main(String[ ] args)
    {
        BaseEnSpker bs = new BaseEnSpker();
        bs.setVolume(10);
        bs.setBaseRate(20);
        bs.showCurrentState();
    }
}