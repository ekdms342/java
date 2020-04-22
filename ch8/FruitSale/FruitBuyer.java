package orange.buyer;
public class FruitBuyer
{
	int mymoney;
	int numOfApple;

	public FruitBuyer (int money)
	{
		mymoney = money;
		numOfApple = 0;
	}

	public void buyApple(orange.seller.FruitSeller seller, int money)
	{
		numOfApple += seller.saleApple(money);
		mymoney -= money;
	}

	public void showBuyResult()
	{
		System.out.println("구입 사과 : " + numOfApple);
		System.out.println("남은 금액 : " + mymoney);
	}
}