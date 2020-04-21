class ch7_1_Q2_2
{
	public static void main (String [] args)
	{
		Child child1 = new  Child(15);
		Child child2 = new Child(9);
		child2.ballPlay (child1, 2);
		child1.ballPlay (child2, 7);
		child1.showBall();
		child2.showBall();
	}
}

class Child
{
	int myBallNum;
	public Child (int ballNum)
	{
		myBallNum = ballNum;
	}
	
	public void ballPlay (Child child, int getBallNum)
	{
		child.myBallNum += getBallNum;
		myBallNum -= getBallNum;
	}

	public void showBall()
	{
		System.out.println("보유 구슬: " + myBallNum);
	}
}  	