/*=================================
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
- �迭�� �⺻�� Ȱ��
=================================*/

/*
char �ڷ����� �迭�� �����
�� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
ä���� �� �迭�� ��ü��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���� �� �ֵ��� �Ѵ�.

���� ��)
A B C D E F G H ... V W X Y Z
����϶�� �ƹ� Ű�� ��������...*/


public class Test081
{
	public static void main(String[] args)
	{
		/*
		char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for (int a=0; a<arr.length; a++)
		{
			System.out.printf("%2c", arr[a]);
		}
		System.out.println();
		*/
//----------------------------------------------------------------------------------------------
		/*
		//��� 1
		char[] arr1;
		arr1 = new char[26];

		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		//    :
		arr[25] = 'Z';

		//��� 2
		char[] arr2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', '', '', '', '', '','Z');
		*/

		//��� 3
		char[] arr3 = new char[26];
		for (int i=0, ch=65; i<arr3.length; i++, ch++)         // i=0~25, ch=65~90
		{
			//�׽�Ʈ
			//System.out.println("i:" + i + " ch:" + ch);

			arr3[i] = (char)ch;
		}

		//�迭 ��� ��ü ���
		for (int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

	}
}