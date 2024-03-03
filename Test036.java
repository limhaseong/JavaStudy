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

//����ڷκ��� ������ ���� �� ���� �Է¹޾�
//���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// ù ��° ���� �Է� : 753
// �� ��° ���� �Է� : 22
// �� ��° ���� �Է� : 124

// >>���� ��� : 22 124 753
// ����Ϸ��� �ƹ� �ų� ��������...

/*
            8     21     24
            --------
			--           --    
			      ---------    ũ�� �� �� �ڸ��� �ٲ۴�.

			25     7     99        -> 7     25     99      -> 7     25     99 
			--------                 --            --               ----------

 1. ù ��° ������ �� ��° ������ ũ�� �񱳸� �Ѵ�.
 -> ù��° ������ �ι�° �������� Ŭ ��� �ڸ� �ٲ��Ѵ�.

 2. ù ��° ������ �� ��° ������ ũ�� ��
 -> ù ��° ������ �� ��° �������� Ŭ ��� �ڸ� �ٲ۴�.

 3. �� ��° ������ �� ��° ������ ũ�� ��
 -> �� ��° ������ �� ��° �������� Ŭ ��� �ڸ� �ٲ۴�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a, b, c;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		if (a>=b && a>=c)
		{	
			//System.out.printf("\n %d, %d, %d\n", b, c, a);
			if (b>c)
			{
				System.out.printf("\n %d, %d, %d\n", c, b, a);
			}
			else
			{
			
			}
		}
		else if (b>=a && b>=c)
		{
			//System.out.printf("\n %d, %d, %d\n", a, c, b);
			if (a>c)
			{
				System.out.printf("\n %d, %d, %d\n", c, a, b);
			}
			else
			{
				
			}
		}
		else if (c>a && c>b)
		{
			System.out.printf("\n %d, %d, %d\n", a, b, c);
			if (a>b)
			{
				System.out.printf("\n %d, %d, %d\n", b, a, c);
			}
			else
			{
				
			}
		}
		
		
		
//--------------------------------------------------------------------------------
		
		/*
		int a, b, c;    // ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		//1. ù ��° ������ �� ��° ������ ũ�� �񱳸� �Ѵ�.
		//	-> ù��° ������ �ι�° �������� Ŭ ��� �ڸ� �ٲ��Ѵ�.

		//2. ù ��° ������ �� ��° ������ ũ�� ��
		//	-> ù ��° ������ �� ��° �������� Ŭ ��� �ڸ� �ٲ۴�.

		//3. �� ��° ������ �� ��° ������ ũ�� ��
		//  -> �� ��° ������ �� ��° �������� Ŭ ��� �ڸ� �ٲ۴�.
		
		if (a>b)   //ù ��° ������ �� ��° �������� Ŭ ���
		{
			//�ڸ� �ٲ�
			a=a^b;
			b=b^a;
			a=a^b;
		}
		//else if�� �� �Ⱦ��°�? ù��° ���� �Ŀ� 2��° ������ �ϴ����� ���� ��.
		//ù��°���� ���� �ϰ� �ι�°���� ������ ���ֱ� ������ if�� ��.
		if (a>c)   //ù ��° ������ �� ��° �������� Ŭ ���
		{
			//�ڸ� �ٲ�
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c)   //�� ��° ������ �� ��° �������� Ŭ ���
		{
			//�ڸ� �ٲ�
			b=b^c;
			c=c^b;
			b=b^c;
		}

		//���� ��� ���
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
		*/


	}
}