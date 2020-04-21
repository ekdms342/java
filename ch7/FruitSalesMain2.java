class FruitSeller
{
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;

	public int saleApple(int money)
	{
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
	public void initMembers(int money,int appleNum, int price)
	{
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;

	}
}

class FruiteBuyer
{
	int mymoney = 10000;
	int numOfApple = 0;

	public void buyApple(FruitSeller seller, int money)
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

class FruitSalesMain2
{
	public static void main (String[] args)
	{
		FruitSeller seller1 = new FruitSeller();
		seller1.initMembers(0,30,1500);

		FruitSeller seller2 = new FruitSeller();
		seller2.initMembers(0,20,1000);

		FruiteBuyer buyer = new FruiteBuyer();
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);

		System.out.println("판매자 1의 현황");
		seller1.showSaleResult();

		System.out.println("판매자 2의 현황");
		seller2.showSaleResult();

		System.out.println("과일 구매자의 현황");
		buyer.showBuyResult();
	}
}
		