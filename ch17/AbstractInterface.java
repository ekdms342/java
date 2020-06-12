abstract class PersonalNumberStorage
{
   public abstract void addPersonalInfo(String name, String perNum);
    public abstract String serchName(String perNum);
}
class PersonalNumInfo
{
    String name;
    String number;

    PersonalNumInfo(String name, String nmber)
    {
        this.name = name;
        this.number = number;
    }
    String getName(){return name;}
    String getNumber() { return number;}
}
class PersonalNUmberStorageImpl extends PersonalNumberStorage
{
    PersonalNumInfo[] perArr;
    int numOfPerInfo;

    public PersonalNUmberStorageImpl(int sz)
    {
        perArr = new PersonalNumInfo[sz];
        numOfPerInfo = 0;
    }

    public void addPersonalInfo(String name, String perNum)
    {
        perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
        numOfPerInfo++;
    }

    public String serchName(String perNum)
    {
        for(int i = 0; i < numOfPerInfo ; i++)
        {
            if(perNum.compareTo(perArr[i].getNumber()) == 0)
            {
                return perArr[i].getName();
            }
        }
 	return null;
    }
}
class AbstractInterface 
{
    public static void main(String[] args)
    {
        PersonalNumberStorage storage = new PersonalNUmberStorageImpl(100);
        storage.addPersonalInfo("rlarlehd", "950000-11223333");
        storage.addPersonalInfo("wkdtksrlf", "97000-11122222");

        System.out.println(storage.serchName("950000-11223333"));
        System.out.println(storage.serchName("97000-11122222"));
    }    
}