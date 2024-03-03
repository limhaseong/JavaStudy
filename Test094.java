/*=================================
■■■ 배열 ■■■
- 배열의 배열
=================================*/


/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
 A                  00
 C  B               11  10
 D  E  F            20  21  22
 J  I  H  G         33  32  31  30
 K  L  M  N  O      40  41  42  43  44
계속하려면 아무 키나 누르세요...

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
		//배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		char ch = 'A';      //65
		
		//배열 구성
		//담아내기 반복문
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
		
		//배열의 배열 전체 출력 구문
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

		// 변수 및 배열 선언
		char arr[][] = new char[5][5];		// char 타입의 [5][5] 배열 메모리 할당 및 선언
		char n = 'A';						// char 타입의 변수 선언 및 'A'값 할당


		// 배열 구성
		for (int i=0;i<arr.length;i++ )		//2중 for 문을 활용하여 할당
		{
			for (int j=0;j<=i;j++ )
			{
				if (i%2==0)					// → 방향으로 할당
				{
					arr[i][j] = n;
					n++;
				}
				else if (i%2!=0)			// ← 방향으로 할당
				{
					arr[i][i-j] = n;
					n++;
				}
				
			}
		}


		// 출력
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
실행 결과
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/