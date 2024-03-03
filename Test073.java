/*=================================
���� Ŭ������ �ν��Ͻ� ����
=================================*/

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
(Calculate Ŭ���� ����)

���� ��)
������ �� ���� �Է�(���� ����) : 100 51
// ������ ������(+ - * /)      : +

>> 100 + 51 = 151
//����Ϸ��� �ƹ� Ű�� ��������...*/

/* �ذ���!
import java.util.Scanner;

class Calculate
{
	int a,b,result;
	char c;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /) : ");
		c = (char)sc.next().charAt(0);
	}
	
	int result()
	{
		if (c=='+')
			result=a+b;
		else if (c=='-')
			result=a-b;
		else if (c=='*')
			result=a*b;
		else if (c=='/')
			result=a/b;
		return result;
	}

	void print(int sum)
	{
		System.out.printf("%d %c %d = %d\n", a, c, b, sum);
	}
}




public class Test073
{
	public static void main(String[] args)
	{
		Calculate ob = new Calculate();

		ob.input();

		int s = ob.result();

		ob.print(s);
	}
}
*/

//-------------------------------------------------------------------------

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	//�ֿ� ���� ����
	int su1, su2;         //����ڷκ��� �Է¹��� �� ������ ��Ƴ� ����
	char op;              //����ڷκ��� �Է¹��� �����ڸ� ��Ƴ� ����

	//�޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}

	//�޼ҵ� ����(��� : ����) -> ������ ���굵 ���� ������� ó��
	int cal()
	{
		int result = 0;

		switch (op)
		{
			case '+': result=su1+su2; break;
			case '-': result=su1-su2; break;
			case '*': result=su1*su2; break;
			case '/': result=su1/su2; break;
			default : result = -1;           //�ƴϸ� int result = -1�ϰ� default �����൵ ��.
		
		}
		return result;
	}

	//�޼ҵ� ����(��� : ���)
	void print(int s)
	{
		System.out.printf("\n>> %d %c %d = %d\n", su1, op, su2, s);
	}
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//Calculate �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input();    // ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		int r = cal.cal();  //������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		cal.print(r);  // ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
	}
}