/*=================================
���� �迭 ����
- �迭�� �迭
=================================*/

/*�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ� �� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
1  2  3  4  5         //--00 01 02 03 04
6  7  8  9  10        //--05 06 07 08 09
11 12 13 14 15        //--     :
16 17 18 19 20        //--     :
21 22 23 24 25        //--20 21 22 23 24
����Ϸ��� �ƹ� Ű�� ��������...*/

public class Test086
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];
		int n=1;
		for (int i=0; i<arr.length; i++) 
		{									                    
			for (int j=0; j<arr[i].length; j++)
			{
				//�׽�Ʈ
				//System.out.println("i :" + i + " j :" + j);
				arr[i][j]=n;
				n++;
			}
		}
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/

//-------------------------------------------------------

		
		//�迭�� �迭 ����
		//int[][] arr;

		//�迭�� �迭 �޸� �Ҵ�
		//arr = new int[5][5];

		//�迭�� �迭 ���� + �޸� �Ҵ�
		int[][] arr= new int[5][5];

		//���� ���� �� �ʱ�ȭ
		int n = 1;            //1 2 3 4 5 6 ... 25

		//�迭�� �迭�� �ݺ����� ��ø ������ Ȱ���Ͽ� ����ȭ
		for (int i=0; i<arr.length; i++)        //��~ -> outer -> 0, 1, 2, 3, 4...25
		{
			for (int j=0; j<arr[i].length; j++)//�� -> inner -> 01234 01234 01234 01234
			{
				arr[i][j] = n;
				n++;
			}
		}
		//������� �����ϸ� �迭�� �� �濡 �� ��Ƴ��� �Ϸ�

		//��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
