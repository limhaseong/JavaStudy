/*=================================
���� �迭 ����
- �迭�� �迭
=================================*/

/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
E  J  O  T  Y        00
D  I  N  S  X        10
C  H  M  R  W        20
B  G  L  Q  V        30
A  F  K  P  U        40
����Ϸ��� �ƹ� Ű�� ��������...

������~
4  3  2  1  0    4  3  2  1  0    4  3  2  1  0    4  3  2  1  0    4  3  2  1  0
40 30 20 10 00 | 41 31 21 11 01 | 42 32 22 12 01 | 43 33 23 13 03 | 44 34 24 14 04
��~ =    0     |        1       |       2        |       3        |        5
*/

public class Test090
{
	public static void main(String[] args)
	{	
		/*
		char[][] arr = new char[5][5];

		char ch=65;

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				arr[4-j][i]=ch;
				ch++;
			}
		}

		for (int i=0; i<arr.length; i++)  
		{
			for (int j=0; j<arr[i].length; j++)  
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}*/

//-------------------------------------------------------------------

		//�迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];
		

		//�迭 ����
		char start = 'A';      //65

		for (int i=0; i<5; i++)  // ��~~ i=         0       1       2      3      4
		{
			for (int j=4; j>=0; j--) // ������~~ j=43210  43210   43210  43210  43210
			{
				arr[j][i]=start++;
			}
		}


		//�迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}
	}
}