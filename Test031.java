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

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� �̻� - A
// 80�� �̻� 90�� �̸� - B
// 70�� �̻� 80�� �̸� - C
// 60�� �̻� 70�� �̸� - D
// 60�� �̸� - F

// ��, BufferedReader�� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

//���� ��)
// �̸� �Է� : ������
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ����� �Դϴ�.
// >> ���� ������ 90
// >> ���� ������ 80
// >> ���� ������ 70
// >> ������ 240�̰�, ����� 80.00�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b, c;
		String name;
		int d;
		double e;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		c = Integer.parseInt(br.readLine());

		d = a + b + c;
		e = d / 3.0;
		
		System.out.println();
		System.out.printf("����� �̸��� %s �Դϴ�.%n", name);
		System.out.printf("���� ������ %d%n", a);
		System.out.printf("���� ������ %d%n", b);
		System.out.printf("���� ������ %d%n", c);

		System.out.printf("������ %d�̰�, ����� %.2f �Դϴ�.\n", d , e);

		if (e >= 90)
		{
			System.out.println("����� ����� A �Դϴ�.");
		}
		else if (e>=80 && e<90)
		{
			System.out.println("����� ����� B �Դϴ�.");
		}
		else if (e>=70 && e<80)
		{
			System.out.println("����� ����� C �Դϴ�.");
		}
		else if (e>=60 && e<70)
		{
			System.out.println("����� ����� D �Դϴ�.");
		}
		else
		{
			System.out.println("����� ����� F �Դϴ�.");
		}
		*/

//----------------------------------------------------------------------------------

		//1. ����ڷκ��� �̸��� �Է¹޴´�.
		System.out.print("�̸� �Է� : ");
		String str = br.readLine();

		//2. ����ڷκ��� ����, ����, ���� ������ �Է¹޴´�.
		System.out.print("���� ���� : ");
		String kor = br.readLine();
		System.out.print("���� ���� : ");
		String eng = br.readLine();
		System.out.print("���� ���� : ");
		String mat = br.readLine();

		//3. ���ڿ� ���·� �Է¹��� ���� ������ ���� ���·� ��ȯ�Ѵ�.
		int nKor = Integer.parseInt(kor);
		int nEng = Integer.parseInt(eng);
		int nMat = Integer.parseInt(mat);

		//4. ��� ������ ���� ������ ����� �����Ѵ�.
		int nTot = nKor + nEng + nMat;      // ����
		double fAvg = nTot / 3.0;   // (double)nTot / 3; ����  -> ���

		//5. ��޿� ���� ���� �˻縦 �����Ѵ�.
		char grade;      // ���
		//char grade = 'F';

		if (fAvg >= 90)
		{
			grade = 'A';
		}
		//else if (fAvg >=80 && fAvg < 90)
		else if (fAvg >= 80) // ������ 90�̻��� ���� �ϰ� �������� ������ fAvg <90 �� �Ƚᵵ ��
		{
			grade = 'B';
		}
		else if (fAvg >= 70)
		{
			grade = 'C';
		}
		else if (fAvg >= 60)
		{
			grade = 'D';
		}
		// else if (fAvg < 60) -> �츮 ������ ������ �� ���������� �ڹ����忡���� ��ģ �� �ִ� �� �ƴϳĴ�
		//                     -> �������� ������ ��.
		//                     -> �ذ��� = 1�� else �� ���� ��,
		//                     ->            2�� char grade = 'F';�� �ڹ� ���忡�� ��ġ�� �� ���Բ� ��
		else                     // if �������� else�� ������ �Ǵ� ���� �ƴ�.
		{
			grade = 'F';
		}

		//6. ���� ��� ���
		System.out.printf("\n>> ����� �̸��� %s �Դϴ�.\n", str);
		System.out.printf(">> ���� ������ %s, \n", kor);
		System.out.printf(">> ���� ������ %s, \n", eng);
		System.out.printf(">> ���� ������ %s, \n", mat);
		System.out.printf(">> ������ %d �̰�, ����� %.2f�Դϴ�.\n", nTot, fAvg);
		System.out.printf(">> ����� ����� %c �Դϴ�.\n", grade);
	}
}

/*������
�̸� �Է� : dla
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� dla �Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240 �̰�, ����� 80.00�Դϴ�.
>> ����� ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/