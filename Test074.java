/*=================================
���� Ŭ������ �ν��Ͻ� ����
- ������(Constructor)
=================================*/

/*
������(Constructor)�� ����
1. �ν��Ͻ� ���� -> �޸� �Ҵ�
2. �ʱ�ȭ

������(Constructor)�� Ư¡
1. �����ڴ� �޼ҵ�������, �Ϲ� �޼ҵ�ó�� ȣ��� �� ������,
    ��ȯ �ڷ����� ���� �� ����.
	(�Ϲ������δ� return �ڷ����� void ������,
	�����ڴ� void ���� ���� �� ������, ���� ��ȯ�� ���� ����.)
2. �����ڴ� Ŭ������ ������ �̸��� ������ �Ѵ�.(��ҹ��� ��Ȯ�� ����)
3. �����ڴ� ��ü�� �����ϴ� �������� new������();�� ���·� ȣ��ȴ�.
    (�ν��Ͻ� ������ �� �� ���� ȣ�Ⱑ��)
	-> final ����(���ȭ�� ����) �ʱ�ȭ �����ϴ�.
*/

class NumberTest
{
	int num;             //���� ������ 0���� �ʱ�ȭ ��.
	
	//��������� ������
	NumberTest()
	{
		num = 1;
		System.out.println("����� ���� ������ ȣ��");
	}
	
	//��������� �����ڸ� �������� ������ �ڵ����� ����Ʈ �����ڰ� ����.
	//����Ʈ(default)������ -> ������ �������� �ڵ����� ����
		//��				     //��, ����� ���� �����ڰ� �������� ���� ��츸..!
	/*NumberTest()
	{
		//�� �������
	}*/

	int getNum()
	{
		return num;
	}
}

public class Test074
{
	public static void main(String[] args)
	{
		//NumberTestŬ���� ����� �ν��Ͻ� ����
		NumberTest nt1 = new NumberTest();
		// ����� ���� ������ ȣ��
		// �ν��Ͻ��� �����Ǵ� ��������
		// �̿� ���ÿ� ������ ���� ���� ������ ȣ���� �̷������.
		//                              -----------
		//                              NumberTest();

				
		int num = nt1.getNum();
		System.out.println(num);
		// ---> 1

		nt1.num=200;
		System.out.println(nt1.getNum());
		// ---> 200

		//NumberTest Ŭ���� ����� �ν��Ͻ� ����
		NumberTest nt2 = new NumberTest();
		// ---> ����� ���� ������ ȣ��
		// NumberTest nt1 = new NumberTest();�̶� ������ new NumberTest();�� 
		// NumberTest nt2 = new NumberTest();�̶� ������ new NumberTest();�� �ٸ� ������.
		
		//nt1�� nt2�� ��ü�� �ٸ�.
		System.out.println("nt1.num : " + nt1.getNum());
		System.out.println("nt2.num : " + nt2.getNum());

	}
}