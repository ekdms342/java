class SinivelCap
{
	public void take() {
		 System.out.println("�๰�� �� ���ϴ�.");
	}
}

class SneezeCap {
	public void take() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�");
	}
}

class SnuffleCap
{
	public void take()
	{
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
}
class CONTAC600 
{
	SinivelCap sin;
	SneezeCap sne;
	SnuffleCap snu;
	
	public CONTAC600()
	{
		sin = new SinivelCap();
		sne = new SneezeCap();
		snu = new SnuffleCap();
	}
	
	public void take()
	{
		sin.take();
		sne.take();
		snu.take();
	}
}

class CoidPatient
{
	public void takeCONTAC600 (CONTAC600 cap)
	{
		cap.take();
	}
}

class Encapsulation2 {
	public static void main(String [] args)
	{
		CoidPatient sufferer = new CoidPatient();
		sufferer.takeCONTAC600(new CONTAC600());
	}

}
