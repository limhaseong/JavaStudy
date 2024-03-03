/*=================================
���� ���� ó��(Exception Handling) ����
=================================*/

//���� �ٽ� ������

public class Test152
{
	public static void main(String[] args)
	{
		Test152 ob = new Test152();

		try
		{
			int a = ob.getValue(-2);    //�� �ٽ� ���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)           //�� ���� ��Ƴ���
		{
			//�� ��Ƴ� ���ܿ� ���� ó���� ��(������ ó���� ���±� ������ main()�޼ҵ忡�� throws Exception �� �ᵵ ��)
			System.out.println("printStackTrace........................");
			e.printStackTrace();
		}
	}

	public int getData(int data) throws Exception //�� �߻��� ���� ������(��� 2�� try-catch����ϸ� �� throws Exception�̰� �Ƚᵵ ��)
	{
		if (data<0)
		{
			//�� ���ʷ� ���ܰ� �߻��� ��Ȳ
			throw new Exception("data�� e���� �۽��ϴ�.");
		}
		return data + 10;
	}
                                   //check!
	public int getValue(int value) throws Exception //�� �ٽ� �߻��� ��Ƴ� ���ܸ� �ٽ� ���� �� �ֵ��� ó���ϴ� ��.(������ ����ߵ� -> �쿡�� �߻��� ���� ������ �ϱ� ����)
	{
		int a = 0;
		try
		{
			//�� �� ��° ���� �߻�
			a=getData(-2);
		}
		catch (Exception e)       //�� -> �鿹�� ��Ƴ���
		{
			//�� -> �꿡�� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("printStackTrace........................");
			e.printStackTrace();
			
			//check!
			//�� ��Ƽ� ó���� ���ܸ� �ٽ� �߻�(������)��Ű�� ��
			throw e;
		}
		return a;

	}
}