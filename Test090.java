/*=================================
■■■ 배열 ■■■
- 배열의 배열
=================================*/

/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
E  J  O  T  Y        00
D  I  N  S  X        10
C  H  M  R  W        20
B  G  L  Q  V        30
A  F  K  P  U        40
계속하려면 아무 키나 누르세요...

숑숑숑~
4  3  2  1  0    4  3  2  1  0    4  3  2  1  0    4  3  2  1  0    4  3  2  1  0
40 30 20 10 00 | 41 31 21 11 01 | 42 32 22 12 01 | 43 33 23 13 03 | 44 34 24 14 04
웅~ =    0     |        1       |       2        |       3        |        5
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

		//배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];
		

		//배열 구성
		char start = 'A';      //65

		for (int i=0; i<5; i++)  // 웅~~ i=         0       1       2      3      4
		{
			for (int j=4; j>=0; j--) // 숑숑숑~~ j=43210  43210   43210  43210  43210
			{
				arr[j][i]=start++;
			}
		}


		//배열 전체 요소 출력
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