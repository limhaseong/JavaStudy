/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- BigInteger Ŭ����
=================================*/

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		//�Ұ���

		//long b1 = 123456789123456789;
		//System.out.println(b1);
		//�Ұ��� (123456789123456789�� int����)
		
		//long c1 = 123456789123456789L;
		//System.out.println(c1);
		//123456789123456789
		//L(l) ���̸� ����

		//long d1 = 123456789123456789123456789L;
		//System.out.println(d1);
		//�Ұ��� (long ������ ����)
		
		BigInteger a = new BigInteger("123456789123456789123456789");
		BigInteger b = new BigInteger("123456789123456789123456789");
		//�������¸� ǥ���ϴµ� �Ѱ�� �־ BigInteger�� ���µ� 123456789123456789123456789�̷��� �ϸ� �������·� ǥ���� �ȵǱ� ������
		// ���ڿ� ���·� ������.
		
		//BigInteger c = a + b; //�Ѵ� primitive ���°� �ƴ�
		//System.out.println(c);
		//������ ���� �߻�
		

		//���ϱ�
		BigInteger c = a.add(b);    //a.add(b); ��׵� BigInteger Ÿ��
		System.out.println("���� ��� : " + c);
		//���� ��� : 246913578246913578246913578

		//����
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : " + d);
		//���� ��� : 0

		//���ϱ�
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : " + e);
		//���� ��� : 15241578780673678546105778281054720515622620750190521

		//������
		BigInteger f = a.divide(b);
		System.out.println("������ ��� : " + f);
		//������ ��� : 1

		//������
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3�� : " + g.pow(3));
		//2�� 3�� : 8
	}
}