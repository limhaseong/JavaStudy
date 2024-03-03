/*=================================
■■■ 배열 ■■■
- 배열의 배열
=================================*/

/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
1  2  3  4  5   -> i=0
2  3  4  5  6   -> i=1
3  4  5  6  7   -> i=2
4  5  6  7  8   -> i=3
5  6  7  8  9   -> i=4
계속하려면 아무 키나 누르세요...
*/

public class Test087
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];
		
		for (int i=0; i<5; i++) 
		{	
			for (int j=0; j<5; j++) 
			{
				arr[i][j]=i+j+1;
			}
		}

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/

//--------------------------------------------------------------------------

		//배열 구성
		int[][] arr = new int[5][5];

		int n;

		for (int i=0; i<arr.length; i++)  //웅~
		{
			n=i+1;

			for (int j=0; j<arr[i].length; j++) //숑숑숑~
			{
				//테스트
				//System.out.print(" i:" + i + ", j:" + j);
				//System.out.print(" [" + n + "] ");

				arr[i][j] = n;
				n++;
			}
			//System.out.println();
		}

		//배열 전체 요소 출력
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