/*=================================
���� ���� ó��(Exception Handling) ����
=================================*/

//Test150.java ���ϰ� ��!

//throw

class Demo
{
	private int value;
	public void setValue(int value) throws Exception
	{
		if (value<=0)
		{
			//return; Test150.java���� �ȵǴ� �� Ȯ������

			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.");
			//new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�."); -> new��� ���ܸ� �߻���Ű�� ��.
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test151
{
	public static void main(String[] args) //throws Exception -> �̰� ���� �ȴٸ� try-catch ���
	{
		Demo ob = new Demo();
	
		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}		
	}
}

/*
������
java.lang.Exception: value �� 0���� �۰ų� ���� �� �����ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/