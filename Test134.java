/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- Wrapper Ŭ����
=================================*/

//Test130.java �� ���� ����

public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//3
		//256

		print(b2);
		print(i2);
	}

	/*
	println(byte b)
	{
		...;
	}

	println(Integer i)
	{
		...;
	}

	println(Long l)
	{
		...;
	}
	*/
	//		��  �� ĳ���� ������ ��.
	/*
	println(Object obj)
	{
		...;
	}
	*/
	
	/*
	api���� ���� 
	Class Byte
	java.lang.Object(���� ����)
	java.lang.Number(2��°)
	java.lang.Byte(3��°)
	
	Number n = new Integer(); ��ĳ����
	*/


	//java.lang.NumberŬ����(�߻� Ŭ����)��
	//��� ������ WrapperŬ������ �θ� Ŭ����
	// ����Ŭ����, ���� Ŭ�����̴�.
	// b2, i2�� �ش��ϴ� �ڷ����� Number�� �Ѿ���鼭
	// �� ĳ������ �Ͼ�� �ȴ�.
	static void print(Number n)
	{
		System.out.println(n);//api�� �Ĳ��ϰ� Ȯ���ؼ� �ϱ�.(Object ������� ���� �ϱ�)
		//3
		//256
		/*
		if (n instanceof Integer)
		{
			System.out.println(n.intValue());
		}
		else if (n instanceof Double)
		{
		}*/
	}
}