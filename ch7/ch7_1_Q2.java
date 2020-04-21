class ch7_1_Q2
{
	public static void main (String [] args)
	{
		Ball Child1 = new  Ball(15);
		Ball Child2 = new  Ball(9);
		Child1.getBall(2);
		Child2.giveBall(2);
		Child2.getBall(7);
		Child1.giveBall(7);
		Child1.showBall();
		Child2.showBall();
	}
}

class Ball
{
	int myBallNum;
	public Ball(int ballNum)
	{
		myBallNum = ballNum;
	}
	
	public void giveBall (int giveBallNum)
	{
		myBallNum -= giveBallNum;
	}
	
	public void getBall (int getBallNum)
	{
		myBallNum += getBallNum;
	}
	
	public void showBall()
	{
		System.out.println("보유 구슬: " + myBallNum);
	}
}  	