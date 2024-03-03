/*=================================
���� ���� ó��(Exception Handling) ����
=================================*/

//Test151.java ���ϰ� ��!

class Demo
{
	private int value;

	public void setValue(int value) //�����ϱ�
	{
		if (value <= 0)     //if���� ������ �ȵ� -> value ���� �����ų� 0�̸� �޼ҵ� �����ض� �ߴµ� 0���� ��µ�.
		{
			return;         //�޼ҵ� ���� -> setValue()
		}
		this.value = value;
	}
	public int getValue() //������ ����
	{
		return value;
	}
}

public class Test150
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}