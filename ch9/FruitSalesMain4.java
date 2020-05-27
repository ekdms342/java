
class FruitSeller
{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller(int money, int appleNum, int price)
	{
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money)
	{
		int num = money/ APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("남은 사과의 수: " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer
{
	int myMoney;
	int numOfApple;
	
	public FruitBuyer(int money)
	{
		myMoney = money;
		numOfApple = 0;
	}
	public void buyApple(FruitSeller seller, int money)
	{
		numOfApple +=seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult()
	{
		System.out.println("사과의 수: " + numOfApple);
		System.out.println("현재잔액 : " + myMoney);
	}
}
public class FruitSalesMain4 
{
	public static void main(String[] args)
	{
		FruitSeller seller = new FruitSeller(0,30,1500);
		FruitBuyer buyer = new FruitBuyer(10000);
		
		seller.myMoney += 500;
		buyer.myMoney -= 500;
		
		seller.numOfApple -= 20;
		buyer.numOfApple += 20;
		
		System.out.println("과일 판배자 현황");
		seller.showSaleResult();
		
		System.out.println("과일 구매자 현황");
		buyer.showBuyResult();
	}

}
