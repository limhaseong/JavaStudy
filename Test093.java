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
 A               00  
 B  C            10  11
 D  E  F         20  21  22  
 G  H  I  J      30  31  32  33
 K  L  M  N  O   40  41  42  43  44

����Ϸ��� �ƹ� Ű�� ��������...

 A             
 B  C           
 D  E  F         
 G  H  I  J      
 K  L  M  N  O
*/

public class Test093
{
	public static void main(String[] args)
	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		char ch = 'A';                   //65
		
		//�迭 ����
		//��Ƴ��� �ݺ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<=i; j++)
			{
				arr[i][j]=ch++;
			}
		}
		
		//�迭�� �迭 ��ü ��� ����
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (arr[i][j]>='A' && arr[i][j]<='O')
				{
					System.out.printf("%3c", arr[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/*
������
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/