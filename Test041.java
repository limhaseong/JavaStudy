/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- switch�� �ǽ�
=================================*/

//����ڷ� ���� 1���� 3������ ���� �� �ϳ��� �Է¹޾�
//�Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
//��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// 1. switch���� �Ϲ� ���� ����Ͽ� �����Ѵ�. -> �����Ӱ� break �ᵵ ��.
// 2. switch���� �⺻ ���� ����ϵ�,
// break�� �� �� ���� ����� �� �ֵ��� �����Ѵ�.(�Է¿��� �ÿ� break ���)

//���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������...

//���� ��)
// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ� Ű�� ��������...

//���� ��)
// ������ ���� �Է�(1~3) : 7
// �Է� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		String t;

		System.out.print("������ ���� �Է�(1~3) : ");
		a = Integer.parseInt(br.readLine());
		
		/*
		switch (a)
		{
			case 1: t="��"; break;
			case 2: t="�ڡ�"; break;
			case 3: t="�ڡڡ�"; break;
			default : t="�Է¿���"; break;
		}
		*/
		
		/* �ذ� ����.
		switch (a)
		{
			default : t="�Է¿���"; break;
			case 3: t="�ڡڡ�"; 
			case 2: t="�ڡ�";
			case 1: t="��";
			default : t="�Է¿���"; break;
		
		}
		*/

		System.out.println();
		System.out.printf(">> %s\n", t);
		


//------------------------------------------------------------------------
		/*
		int n;

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());
	
		
		// 1��
		switch (n)
		{
			case 1:System.out.println("��"); break;
			case 2:System.out.println("�ڡ�"); break;
			case 3:System.out.println("�ڡڡ�"); break;
			default : System.out.println("�Է¿���"); break;
		}
		*/

		//2��
		/*
		switch (n)
		{	
			default :System.out.println("�Է¿���"); break;
			case 3:System.out.print("��");
			case 2:System.out.print("��");
			case 1:System.out.print("��");
		}*/
		
		/*
		switch (n)
		{	
			case 3:System.out.print("��");
			case 2:System.out.print("��");
			case 1:System.out.print("��"); break;
			default :System.out.println("�Է¿���");
		}
		
		System.out.println();
		*/


	}
}