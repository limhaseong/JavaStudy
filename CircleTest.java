/*=================================
���� Ŭ������ �ν��Ͻ� ����
=================================*/

// Test071.java ���ϰ� �� ��Ʈ

//���� ���̿� �ѷ� ���ϱ�.
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
//Ŭ������: CircleTest
//�Է��� BufferedReader�� readLine()�� ����.

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
// ������ �Է�: xxx
//
//>> �������� xxx�� ����
//>> ���� : xxxx
//>> �ѷ� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
class Circle
{
		int r;
		double p = 3.141592;

		void input() throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("������ �Է� : ");
			r = Integer.parseInt(br.readLine());
		}

		double area()
		{
			return r * r * p;
		}

		double length()
		{
			double res;
			res=r*2*p;
			return res;
		}
		void print(double a, double b)
		{
			System.out.println("��������" + r + "�� ����");
			System.out.println("���� �Է� : " + a);
			System.out.println("�ѷ� �Է� : " + b);
		}
}

public class CircleTest
{
	public static void main(String[] args) throws IOException
	{
		Circle ob = new Circle();

		ob.input();

		double ar = ob.area();
		double leng = ob.length();

		ob.print(ar, leng);
	}
}
*/

public class CircleTest
{
	// �ֿ� �Ӽ�(������, ����) -> ��� ����
	int r;                     //������
	final double PI = 3.141592;      //�������� �߰��� ������ ����(������ ���ȭ) -> �빮�� ����


	// �ֿ� ���(����, ����) -> ��� �޼ҵ�
	
	// ������ �Է� ���
	void input() throws IOException                     //�������� �Է� �ϰԲ�, �Է� �ްԲ� �ϴ� ������ �ϴ� �� ��.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// ���� ��� ���
	double calArea()
	{
		//���� ���� = ������ * ������ * 3.141592
		return r*r*PI;
	}

	// �ѷ� ��� ���
	double calLength()
	{
		//���� �ѷ� = ������*2*3.141592
		double result;
		result = r*2*PI;
		return result;
	}

	// ��� ��� ���
	void print(double a, double b)
	{
			System.out.printf("\n �������� %d�� ����\n", r);
			System.out.printf("���� : %.2f \n", a);
			System.out.printf("�ѷ� : %.2f \n", b);
	}
}