/*=================================
���� Ŭ������ �ν��Ͻ� ����
- ������(Constructor)
=================================*/

class NumberTest2
{
	int num;

	//����Ʈ(default) ������
	/*NumberTest2()
	{
		              //�̷� ���·� �ڵ����� ����.
	}*/
	
	// ����� ���� �����ڰ� ���ǵǾ� �����Ƿ�
	// default �����ڰ� �ڵ����� ���Ե��� ����.

	//������ -> ����� ���� ������
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}

	int getNum()
	{
		return num;
	}
}

public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2 �ν��Ͻ� ����
		// NumberTest2 ob = new NumberTest2();
		// -> ������ ���� �߻�
		// NumberTest2 Ŭ��������
		// ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		// default�����ڰ� �ڵ����� ���Ե��� ������,
		// ����ڰ� ������ �����ڴ� �Ű������� ���� �����̹Ƿ�
		// ���� ���� �Ű����� ���� �����ڸ� ȣ���ϴ� ������ ������
		// ������ �߻���Ű�� �ȴ�.

		NumberTest2 ob2 = new NumberTest2(10);
		//������ ȣ�� �� �Ű����� ���� : 10
		//���� ������ �Ű������� ȣ���ؼ� �ν��Ͻ� ������ �� ���̱⿡ ���� �ȳ�.

		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());
		//�޼ҵ� ��ȯ �� : 10

		System.out.println("ob2.num : " + ob2.num);
		//ob2.num : 10

		NumberTest2 ob3 = new NumberTest2(2000);
		//������ ȣ�� �� �Ű����� ���� : 2000

		System.out.println("�޼ҵ� ��ȯ �� : " + ob3.getNum());
		//�޼ҵ� ��ȯ �� : 2000

		System.out.println("ob3.num : " + ob3.num);
		//ob3.num : 2000


	}
}