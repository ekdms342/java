class SinivelCap
{
	public void take() {
		 System.out.println("�๰�� ��~ ���ϴ�.");
	}
}

class SneezeCap {
	public void take() {
		System.out.println("��ä�Ⱑ �½��ϴ�.");
	}
}

class SnuffleCap
{
	public void take()
	{
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
}
class ColdPatient
{
	public void takeSinivelCap(SinivelCap cap) { cap.take();}
	public void takeSneezeCap(SneezeCap cap) { cap.take();}
	public void takeSnuffleCap(SnuffleCap cap) {cap.take();}
}

class Encapsulation1 {
	public static void main(String[] args)
	{
		ColdPatient sufferer = new ColdPatient();
		sufferer.takeSinivelCap(new SinivelCap());
		sufferer.takeSneezeCap(new SneezeCap());
		sufferer.takeSnuffleCap(new SnuffleCap());
		
	}

}
