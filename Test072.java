/*=================================
���� Ŭ������ �ν��Ͻ� ����
=================================*/

/*
����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �� ������ ���� �����Ͽ�
������� ����ϴ� ���α׷��� �����Ѵ�.

��, ���ݱ��� ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
(Hap Ŭ���� ����)
����, ������ �Է� ó�� �������� BufferedReader�� readLine()�� ����ϸ�,
�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

���� ��)
������ ���� �Է�(1~1000) : 1200
������ ���� �Է�(1~1000) : -50
������ ���� �Է�(1~1000) : 100
>> 1~100 ������ �� : 5050
//����Ϸ��� �ƹ� Ű�� ��������...*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*  //�ذ����
class Hap
{
	int a,b;
	
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				a = Integer.parseInt(br.readLine());
			}
			while (a<1 || a>1000);
		}
	}

	int num1()
	{
		int sum = 0;
		for (b=1; b<=a; b++)
		{
			return sum+=b;	
		}
	}
	void print(int a)
	{
		System.out.printf("\n1~%d������ �� : %d\n", a, sum);
	}
}




public class Test072
{
	public static void main(String[] args) throws IOException  
	{
		Hap ob = new Hap();

		ob.input();

		int nump = ob.num1();

		ob.print(a);
	}
}
*/ 
//---------------------------------------------------------------------------------

class Hap
{
	//�ֿ� ���� ����(������� �Է°��� ��Ƴ� ����
	int su;

	//�Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
	}

	//���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;
		for (int i=1; i<=su; i++)
		{
			result+=i;
		}
		return result;
	}

	//��� ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf("\n>> 1-%d ������ �� : %d\n", su, sum);
	}

}

public class Test072
{
	public static void main(String[] args) throws IOException  
	{
		//Hap �ν��Ͻ� ����
		Hap ob = new Hap();

		//������ �ν��Ͻ� ���� �Է� �޼ҵ� ȣ��
		//--------------------
		// �������� Ȱ��
		ob.input();         //new Hap().input(); ����

		//������ �ν��Ͻ��� ���� ���� �żҵ� ȣ��
		int s = ob.calculate();

		//������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		ob.print(s);              //ob.print(ob.calculate()); ����
		
	}
}