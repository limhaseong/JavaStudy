/*=================================
���� �迭 ����
- �迭�� �迭
=================================*/

//����
/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 A  B  C  D  E     00  01  02  03  04
 F  G  H  I  J     01
 K  L  N  M  O     02
 P  Q  R  S  T     03
 U  V  W  X  Y     04

����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test092
{
	public static void main(String[] args)
	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		char start = 'A';      //65
		
		//�迭 ����
		//��Ƴ��� �ݺ���
		for (int i=0; i<arr.length; i++) 
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=start++;
			}
		}
		
		//�迭�� �迭 ��ü ��� ����
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

/*
������
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/