/*=================================
■■■ 배열 ■■■
- 배열의 배열
=================================*/

/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
 1  2  3  4  10        00  01  02  03  04
 5  6  7  8  26        10              14
 9 10 11 12  42        20              24
13 14 15 16  58        30              34
28 32 36 40  136       40  41  42  43  44

계속하려면 아무 키나 누르세요...

반복문 필요oㅣ 반복문 필요x
 1  2  3  4 ㅣ  10
 5  6  7  8 ㅣ  26
 9 10 11 12 ㅣ  42
13 14 15 16 ㅣ  58
ㅡㅡㅡㅡㅡㅡ
28 32 36 40     136  반복문 필요x 
*/

public class Test091
{
	public static void main(String[] args)
	{	
		/*//방법1
		int[][] arr = new int [5][5];

		int n = 1;
		int sum=0;

		for (int i=0; i<4; i++)        
		{
			for (int j=0; j<4; j++)
			{
				arr[i][j] = n;
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				sum+=arr[i][j];
				n++;
			}
		}
		arr[4][4]=sum;

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}*/


//---------------------------------------------------------
		
		/*//방법2
		int arr[][] = new int[5][5];
		int n=1;
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				arr[i][j]=n;
				arr[i][4]+=n;
				arr[4][j]+=n;
				arr[4][4]+=n;
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

//----------------------------------------------------------
		
		/* //이 방법은 조금 해결 안됨.
		int[][] arr1= new int[5][5];
		int n=1;
		int sum1=0;
		int sum2=0;

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				if (i<4 && j<4)
				{
					arr1[i][j]=n;
					n++;
				}
			}
		}
		//(0,0)(1,0)(2,0)(3,0)(4,0)


		//arr1[4][0] = arr[0][0]+arr[1][0]+arr[2][0]+arr[3][0]
		//arr1[4][1] = arr[0][1]+arr[1][1]+arr[2][1]+arr[3][1]

		for (int j=0; j<5; j++)
		{
			for (int i=0; i<5; i++)
			{
				sum1+=arr1[i][j];

				if (i==4 && j<4)
				{
					arr1[i][j]=sum1;
				}
			}
			sum1-=sum1;
		}

		for (int j=0; j<5; j++)
		{
			for (int i=0; i<5; i++)
			{
				sum2+=arr1[i][j];

				if (j==4)
				{
					arr1[i][j]=sum2;
				}
			}
			sum2-=sum2;
		}

		for (int i=0; i<arr1.length; i++)
		{
			for (int j=0; j<arr1[i].length; j++)
			{
				System.out.printf("%4d", arr1[i][j]);
			}
			System.out.println();
		}
		*/

		


//-----------------------------------------------------------
		
		
		int[][] arr=new int[5][5];
		int n=0;
		
		//테스트 변수
		int sum=0;

		//배열 구성
		//각 for문 수식2의 -1  -> 반복문의 처리가 필요하지 않은 영역 때문임. (위에 그림)
		for (int i=0; i<arr.length-1; i++)           //웅~     i=  0    1    2   3
		{
			for (int j=0; j<arr[i].length-1; j++)    //숑숑숑~ j=0123 0123 0123 0123
			{
				n++;
				arr[i][j]=n;
				
				//테스트
				//sum+=arr[i][j];
				//System.out.printf("%4d", sum);
				

				arr[i][4]+=arr[i][j];
				//arr[i][arr[i].length-1]
				//arr[0][4]+=arr[0][0];
				//		 +=arr[0][1];
				//		 +=arr[0][2];
				//		 +=arr[0][3]; ...
				
				arr[4][j]+=arr[i][j];
				//arr[arr.length-1][j]
				//arr[4][0]+=arr[0][0];
				//		 +=arr[1][0];
				//		 +=arr[2][0];
				//		 +=arr[3][0]; ...
				
				arr[4][4]+=arr[i][j];
				//arr[arr[i].length-1][arr.length-1]
				//arr[4][4]+=arr[0][0];
				//		 +=arr[0][1];
				//		 +=arr[0][2];
				//		 +=arr[0][3]; ...

				
				

			}
		}
		
		




		//배열의 배열 전체 출력 구문
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}