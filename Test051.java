/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- �ݺ���(while��) �ǽ� �� ����
=================================*/

//����ڷκ��� ������ �� ������ �Է¹޾�
//�Է� ���� �� ���� ��
//���� �� ���� ū �������� ���� ���Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// ù ���� ���� �Է� : 100
// �� ��° ���� �Է� : 200
// >>100~200 ������ �� : xxxx
//��� �Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 1000
// �� ��° ���� �Է� : 2
// >> 2~1000������ �� : xxx
//��� �Ϸ��� �ƹ� Ű�� ��������...

// // ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 10
// >> 10~10������ �� : 10
//��� �Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b;
		int sum=0;

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());
		
		int c = a;
		int d = b;
		
		if (a<b)
		{
			while (a<b)
			{
				sum+=a;
				a++;
			}
		}
		a = c;

		if (a>b)
		{
			while (a>b)
			{
				sum+=b;
				b++;
			}
		}
		b = d;

		System.out.printf("%d ~ %d �� �� : %d", c, d, sum);
		*/ //�ذ� ����

//----------------------------------------------------------------------------------------
		
		System.out.print("ù ��° ���� �Է� :");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� :");
		int b = Integer.parseInt(br.readLine());
		
		int c = a;
		int d = b;

		if (a<b)
		{
			int sum = a;

			while (a<b)
			{
				a++;
				sum+=a;
			}
			a=c;

		System.out.printf("%d ~ %d������ �� : %d\n", a, b, sum);
		}

		if(a>b)
		{
			int sum=b;
			while(a>b)
			{
				b++;
				sum += b;
			}
			b=d;

		System.out.printf("%d ~ %d������ �� : %d\n", b, a, sum);
		}

		if(a==b)
		{
			System.out.printf("%d ~ %d������ �� : %d\n", a, a, a);
		}


		
//-----------------------------------------------------------------------------------------
		/*
		//�ֿ� ���� ����

		int n;                //���� ������ Ȱ���� ����
		int su1, su2;         //ù��°, �ι�° ����� �Է°��� ��Ƴ� ����
		int result=0;         //�������� ��Ƴ� ����
		
		//���� �� ó��
		System.out.print("ù ��° ���� �Է� :");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� :");
		su2 = Integer.parseInt(br.readLine());
		
		//�Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		//��, su1�� su2���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1>su2)
		{
			//�ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}
		//�ݺ� ���� ����
		//�ݺ� ���� ���� ����
		//���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		//(��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�
		// �� ���� �ݺ� �������� ����ϰ� �Ǹ�
		// ���� ó�� �Էµ� ���� Ȯ���� �� ���� ������) ���� n�� �����
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		//��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2, result);
		*/
	}
}
