/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- if��
- if ~ else�� �ǽ�
=================================*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
�б� ������ ���ϱ� ���� ����ϴ� �������
if��, if~else��, ���ǿ�����, ���� if��(if�� ��ø), switch���� �ִ�.

2. if���� if ������ ������ ��(true)�� ���
Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.
*/

//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ Ȧ������, ¦������, ������ Ȯ���Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 14
// 14 -> ¦��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 13
// 13 -> Ȧ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 0
// 0 -> ��
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		int a;

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		String res;

		if (a==0)
		{
			res = "��";
		}
		else if (a%2==1)
		{
			res = "Ȧ��";
		}
		else
		{
			res = "¦��";
		}

		System.out.printf(">> %d -> %s\n", a, res);
		*/

//----------------------------------------------------------------------------------------

		int n;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		/*
		if(n%2==0)
		{
			System.out.println(n + "-> ¦��");
		}
		else if (n%2!=0)
		{
			System.out.println(n + "-> Ȧ��");
		}
		else
		{
			System.out.println(n + "-> ��");
		}
		�������� �ڵ�
		/*

		/*
		if(n%2!=0)
		{
			System.out.println(n + "-> Ȧ��");
		}
		else if (n%2==0)
		{
			System.out.println(n + "-> ¦��");
		}
		else
		{
			System.out.println(n + "-> ��");
		}
		�������� �ڵ�*/

		/*
		if(n%2!=0)
		{
			System.out.println(n + "-> Ȧ��");
		}
		else if (n==0)
		{
			System.out.println(n + "-> ��");
		}
		else if (n%2==0)
		{
			System.out.println(n + "-> ¦��");
		}
		���� �ȳ��� �ڵ�*/

		/*
		String result ="�����Ұ�";
		if (n==0)
		{
			result = "��";
		}
		else if (n%2==0)
		{
			result = "¦��";
		}
		else if (n%2!=0)
		{
			result = "Ȧ��";
		}

		System.out.println(n + "->" + result);
		���� �Ұ��� �ڵ嵵 �ϳ� ���� ���� ���Բ� �ϴ� ���� �ٶ�����*/



	}
}