class FruitSeller
{
	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;

	public int saleApple(int money)
	{
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney +=money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("남은 사과 : " +numOfApple);
		System.out.println("판매 수익 : " +myMoney);
	}
}

class FruitBuyer
{
	int mymoney = 5000;
	int numOfApple = 0;
	
	public void buyApple(FruitSeller seller, int money)
	{
		numOfApple += seller.saleApple(money);
		mymoney -= money;
	}
	public void showBuyresult()
	{
		System.out.println("현재 잔액 : " + mymoney);
		System.out.println("구입 사과 : " + numOfApple);
	}
}


class FruitSalesMain1
{
	public static void main (String[] args)
	{
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		buyer.buyApple(seller, 2000);
		
		System.out.println("판매자의 현황");
		seller.showSaleResult();

		System.out.println("구매자의 현황");
		buyer.showBuyresult();
	}
}

		