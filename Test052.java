/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- �ݺ���(while��) �ǽ� �� ����
=================================*/

/* ����
����ڷ� ���� ������ ������ �Է¹޾�
1 ���� �Է¹��� �� ����������
��ü �հ�, ¦���� �հ�, Ȧ���� ����
���� ��������� �����Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
������ ���� : 396
>>1~396������ ������ �� : 
>>1~396���� ¦���� �� :
>>1~396���� Ȧ���� �� :
//����Ϸ��� �ƹ� Ű�� ��������...

������ �ϴ� �Ŷ� �ٸ� ���� �ڿ� ���ڰ� �������� �ʰ�
����ڰ� �Է��� ��������� ��.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, sum, even, odd;    //����ڰ� �Է��� ������ ����, ���� ��, ¦�� ��, Ȧ�� ��
		sum=even=odd=0;           //���� �ʱ�ȭ
		int b=1;				  //���� ������ Ȱ��
		
		//���� �� ó��
		System.out.print("������ ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		while (b<=a)
		{
			sum+=b;           // ������ ��
		if (b%2==0)
		{
			even+=b;          // ¦���� ��
		}
		else if (b%2!=0)
		{
			odd+=b;           // Ȧ���� ��
		}
		else
		{
			System.out.println("�Ǻ� �Ұ�");
			return;	
		}
		b++;
		}
		
		//��� ���
		System.out.printf("1 ~ %d ������ �� : %d\n", a, sum);
		System.out.printf("1 ~ %d ¦���� �� : %d\n", a, even);
		System.out.printf("1 ~ %d Ȧ���� �� : %d\n", a, odd);
	}
}

/*
������

������ ���� �Է� :3
1 ~ 3 ������ �� : 6
1 ~ 3 ¦���� �� : 2
1 ~ 3 Ȧ���� �� : 4
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

 */