/*=================================
���� �迭 ����
- �迭�� �迭
=================================*/


/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 A                  00
 C  B               11  10
 D  E  F            20  21  22
 J  I  H  G         33  32  31  30
 K  L  M  N  O      40  41  42  43  44
����Ϸ��� �ƹ� Ű�� ��������...

 A  
 C  B 
 D  E  F 
 J  I  H  G 
 K  L  M  N  O 
*/

public class Test094
{
	public static void main(String[] args)
	{
		/*
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		char ch = 'A';      //65
		
		//�迭 ����
		//��Ƴ��� �ݺ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<=i; j++)
			{
				if (ch=='B')
				{
					arr[i][j]='C';
				}
				else if (ch=='C')
				{
					arr[i][j]='B';
				}
				else if (ch=='G')
				{
					arr[i][j]='J';
				}
				else if (ch=='H')
				{
					arr[i][j]='I';
				}
				else if (ch=='I')
				{
					arr[i][j]='H';
				}
				else if (ch=='J')
				{
					arr[i][j]='G';
				}
				else
				{
					arr[i][j]=ch;
				}
				ch++;
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
		}*/

//-----------------------------------------------------------------------

		// ���� �� �迭 ����
		char arr[][] = new char[5][5];		// char Ÿ���� [5][5] �迭 �޸� �Ҵ� �� ����
		char n = 'A';						// char Ÿ���� ���� ���� �� 'A'�� �Ҵ�


		// �迭 ����
		for (int i=0;i<arr.length;i++ )		//2�� for ���� Ȱ���Ͽ� �Ҵ�
		{
			for (int j=0;j<=i;j++ )
			{
				if (i%2==0)					// �� �������� �Ҵ�
				{
					arr[i][j] = n;
					n++;
				}
				else if (i%2!=0)			// �� �������� �Ҵ�
				{
					arr[i][i-j] = n;
					n++;
				}
				
			}
		}


		// ���
		for (int i=0;i<arr.length;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%2c",arr[i][j]);
			}
			System.out.println();
		}

	}
}

/*
���� ���
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/