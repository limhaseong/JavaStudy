/*=================================
���� �迭 ����
- �迭�� �⺻�� Ȱ��
=================================*/

// ������ �������� ����ִ� �迭�� ���� �����͵� ��
// ¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ�
// ���α׷��� �����Ѵ�.

// �迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8

// ���� ��)
// �迭 ��� ��ü ���
// 4 7 9 1 3 2 5 6 8
// ¦�� ������ ���
// 4 2 6 8
// 3�� ��� ������ ���
// 9 3 6
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test080
{
	public static void main(String[] args)
	{
		/*
		int[] arr;

		arr = new int[9];

		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		/*
		int [] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		
		System.out.println("�迭 ��� ��ü ���");

		for (int a=0; a<9; a++)
		{
			System.out.printf("%d", arr[a]);
		}
		
		System.out.println("\n¦�� ������ ���");
		for (int a=0; a<9; a++)
		{
			if (arr[a]%2==0)
			{
				System.out.printf("%d", arr[a]);
			}
		}

		System.out.println("\n3�� ��� ������ ���");
		for (int a=0; a<9; a++)
		{
			if (arr[a]%3==0)
			{
				System.out.printf("%d", arr[a]);
			}
		}
		System.out.println();
		*/

//--------------------------------------------------------------------------

		//�迭 ���� �� �ʱ�ȭ
		//��� 1
		/*int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		//��� 2
		int[] arr ={4, 7, 9, 1, 3, 2, 5, 6, 8};

		//System.out.println(arr);
		//[I@15db9742

		// �Ϲ����� ������ ��� ������ ����ϴ� ����(���)���δ�
		// �迭�� ��� �����͵��� ����� �� ����.
		
		/*
		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<9; i++)                    //i<=8�� ���ϴ� ������ int[9]�� ������
		{
			System.out.print(arr[i] + " ");
			//�迭 ��� ��ü ���
			//4 7 9 1 3 2 5 6 8
		}
		System.out.println();
		*/
		
		/*
		int[] arr2 = {3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 3, 5, 1, 3, 7, 2, 5, 3, 2, 1, 4};
		System.out.println(arr2.length);
		//21                            -> ����� �𸦶� ����� �� ����.
		*/

		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("¦�� ������ ���");
		for (int i=0; i<arr.length; i++)
		{
			/*// Ʋ�� ��
			if (i%2==0)                   // i�� ¦����� ¦�� ��°�� �ش��ϴ� ��Ҷ��
			{
				//System.out.print(i + " ");                  // �ش� �ε����� �����~
				System.out.print(arr[i] + " ");             //�ε����� �ش��ϴ� ���� �����~
			}*/
			
			if (arr[i]%2==0)     //i��° ����� ���� ¦�����
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println("\n3�� ��� ������ ���");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%3==0)     //i��° ����� ���� ¦�����
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}