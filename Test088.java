/*=================================
■■■ 배열 ■■■
- 배열의 배열
=================================*/

/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
1  2  3  4  5   -> i=0   -> 12345   -> 0위치부터 출발  -> i위치부터 출발
5  1  2  3  4   -> i=1   -> 12345   -> 1위치부터 출발  -> i위치부터 출발
4  5  1  2  3   -> i=2   -> 12345   -> 2위치부터 출발  -> i위치부터 출발
3  4  5  1  2   -> i=3   -> 12345   -> 3위치부터 출발  -> i위치부터 출발
2  3  4  5  1   -> i=4   -> 12345   -> 4위치부터 출발  -> i위치부터 출발
계속하려면 아무 키나 누르세요...

             0으로
1  2  3  4  5  ㅣ
   1  2  3  4  ㅣ  5
      1  2  3  ㅣ  4  5
         1  2  ㅣ  3  4  5
            1  ㅣ  2  3  4  5

*/

public class Test088
{
	public static void main(String[] args)
	{	
		/*//방법 1
		int[][] arr = new int[5][5];
		int n=1;

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (i==0)
				{
					arr[i][j] = n;
					n++;
				}
				if (i<=3 && j<=3)
				{
					arr[i+1][j+1]=arr[i][j];
				}
				if (i>j)
				{
					arr[i][j] = 7-arr[j][i];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();	
		}*/

//-----------------------------------------------------------------------------------
		
		/*//방법2
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				int n=j-i;
				if (j-i<0)
				{
					n+=5;
				}
				arr[i][j]=n+1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		*/

//----------------------------------------------------------------------------------------
		
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		
		//담아내기 반복문
		for (int i=0; i<arr.length; i++)      //i - 0 1 2 3 4
		{
			for (int n=1, j=i; n<=5; n++)       //n - 1 2 3 4 5
			{
				//테스트
				//System.out.print(" " + i + "," + j + " [" + n + "]");  //--> 출력하라는 것
				
				arr[i][j] = n;      //-->담아내는 것
				j++;

				if(j==5)
					j=0;

			}
		}

		//출력 반복문
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

/*실행결과
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/