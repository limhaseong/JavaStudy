/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- �ݺ���(while��) �ǽ� �� ����
=================================*/

// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1��~9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

//���� ��)
//���ϴ� ��(������)�Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
//     :
// 7 * 9 = 63
// ����Ϸ��� �ƹ� Ű�� ��������...

//���ϴ� ��(������)�Է� : 11
//1���� 9������ ������ �Է��� �����մϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		int a, b=1;

		System.out.print("���ϴ� ��(������) �Է� :");
		a = Integer.parseInt(br.readLine());
		
		if (a<10)
		{
			while (b<10)
			{	
				//�׽�Ʈ
				//System.out.println("�ݺ��� ���� -> n : " + n);
				System.out.printf("%d * %d = %d\n", a, b, (a*b));
				b++;
			}
		}
		else
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}
		*/
		

//------------------------------------------------------------------------------------------------------

		//�ֿ� ���� ���� �� �ʱ�ȭ
		int dan;              //����ڷκ��� �Է°��� ���� ���·� ��Ƶ� ����(��)

		//���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� :");
		dan = Integer.parseInt(br.readLine());

		if (dan<1 || dan>9)
		{
			System.out.println("1���� 9���� ������ �Է��� �����մϴ�.");
			return;   //return�� ǰ���ִ� main()�� ������ -> ���α׷� ����
		}

		int n=0;

		//������(�ݺ����)
		while (n<9)  //0 1 2 3 4 5 6 7 8
		{
			n++;
			System.out.printf("%d & %d = %d\n", dan, n, (dan*n));
		}
	}
}

/*������
���ϴ� ��(������) �Է� :5
5 & 1 = 5
5 & 2 = 10
5 & 3 = 15
5 & 4 = 20
5 & 5 = 25
5 & 6 = 30
5 & 7 = 35
5 & 8 = 40
5 & 9 = 45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ϴ� ��(������) �Է� :14
1���� 9���� ������ �Է��� �����մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/