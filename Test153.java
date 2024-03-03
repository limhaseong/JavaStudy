/*=================================
���� ���� ó��(Exception Handling) ����
=================================*/

//�ٸ� ���� �ٽ� ������

public class Test153
{
	public int getValue(int value) throws Exception          //�� ���� ������(�Ķ���ź ������) -> ������ throws Exception ����ߵ�.
															 //���⼭ ���� ��ź�� main()�޼ҵ�� ��
	{
		int a = 0;

		try
		{
			a = getData(-2);                                 //�� ���� �߻�(������ź ����)
		}
		catch (Exception e)                                  //�� ���� ��Ƴ���(������ź ��Ƴ���)
		{
			//�� ���ܿ� ���� ó��(������ź�� ���� ó��)
			System.out.println("printStackTrace.................");
			e.printStackTrace();
			
			//check!
			//�� ���ο� ���� �߻�(�Ķ���ź�̶� ����)
			throw new Exception("value �� �����Դϴ�.");
		}

		return a;
	}
	
	public int getData(int data) throws Exception            //�� ���� ������(������ź ������)
	{
		if (data<0)
		{
			throw new Exception("value�� 0���� �۽��ϴ�.");  //�� ������ ���� �߻�(������ź�̶� ����)
		}
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test153 ob = new Test153();
		
		try
		{
			int a = ob.getValue(-2);                         //�� ���� �߻�(�Ķ���ź)
			System.out.println("a : " + a);
		}
		catch (Exception e)                                  //�� ���� ��Ƴ���(�Ķ���ź ��Ƴ���)
		{
			System.out.println("printStackTrace.................");
			e.printStackTrace();
		}
	}
}