class Car 
{
     int gaeolineGauge;
     public Car(int gaeolineGauge)
     {
        this.gaeolineGauge = gaeolineGauge;
     }

     public static void main( String[]args)
     {
         HybirdWaterCar HWC = new HybirdWaterCar(30, 40, 50);
         HWC.showCurrentGauge(); 
     }
}

class HybridCar extends Car
{
    int electricGauge;
    public HybridCar(int gaeolineGauge, int electricGauge)
    {
        super(gaeolineGauge);
        this.electricGauge = electricGauge;
    }
}

class HybirdWaterCar extends HybridCar
{
    int WaterGauge;
    public HybirdWaterCar(int gaeolineGauge, int electricGauge, int WaterGauge)
    {
        super(gaeolineGauge, electricGauge);
        this.WaterGauge  = WaterGauge;
    }

    public void showCurrentGauge()
    {
        System.out.println("잔여 가솔린 :" + gaeolineGauge);
        System.out.println("잔여 전기 : " + electricGauge);
        System.out.println("잔여 물 : " + WaterGauge);
    }
}