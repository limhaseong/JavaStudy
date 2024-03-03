/*=================================
■■■ 정렬(sort) 알고리즘 ■■■
=================================*/

/*
- 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열하는 것(오름차순, 내림차순)

- 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	 -> 보기 좋게 하기 위함, 찾기 좋게 하기 위함, 검색을 편하게 하기 위함

- 정렬은 부하가 심하다 -> 리소스를 많이 사용한다.

- 정렬의 종류
	: 선택 정렬, 삽입 정렬, 버블 정렬, 힙 정렬, 퀵 정렬, 셀 정렬 ...
*/

//정렬들 한번씩 해보기.

//버블 정렬(거품 정렬, Bubble Sort)
//실행 예)
//Source Data: 52 42 12 62 69
//Bubble Data: 12 42 52 60 62
//계속하려면 아무 키나 누르세요...

public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		
		int i, j;
		
		System.out.print("Source Data: ");
		for (int n : a)                
		{
			System.out.print(n + " ");
		}
		System.out.println();

		// 정렬
		// Bubble Sort
		for (i=1; i<a.length; i++)                //웅~~     i -> 뒤에서 비교 대상을 하나씩 줄여주는 역할 1     2     3     4
		{
			for (j=0; j<a.length-i; j++)          //숑숑숑~~ j -> 비교기준 인덱스                        0123  012    01    0
			{
				if (a[j]>a[j+1])                  //오름차순   // if (a[j]<a[j+1]) -> 내림차순
				{
					//자리바꿈
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
				}
			}
		}

		System.out.print("Bubble Data: ");
		for (int n : a )
		{
			System.out.print(n + " ");
		}
		System.out.println();

//----------------------------------------------------------------------------------
		
		/*
		
		System.out.print("Source Data: ");

		for (int i=0; i<a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		System.out.println();

		for (int j=4; j>0; j--)
		{
			for (int i=0; j-i>0; i++)
			{
				if (a[i]>a[i+1])
				{
					a[i]=a[i]^a[i+1];
					a[i+1]=a[i+1]^a[i];
					a[i]=a[i]^a[i+1];
				}
			}
		}
		System.out.print("Bubble Data: ");
		for (int i=0; i<a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		System.out.println();
		*/

//------------------------------------------------------------------------------
		
		/*
		System.out.print("Source Data: ");

		for (int i=0; i<a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		System.out.println();
		
		for (int i=0; i<a.length-1; i++)                  
		{
			for (int j=0; j<a.length-1; j++)              
			{
				if (a[j]>a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
				}
			}
		}
		
		System.out.print("Bubble Data: ");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();*/
		
		

		/*
		52, 42, 12, 62, 60 -> 42, 52, 12, 62, 60 -> 42, 12, 52, 62, 60 -> 42, 12, 52, 62, 60 -> 42, 12, 52, 60, 62 -> 1회전 끝(가장 큰 수가 오른쪽에 자리를 잡음)
		==  --  비교              ==  --  비교              ==  --  비교              ==  -- 비교

		42, 12, 52, 60, 62 -> 12, 42, 52, 60, 62 -> 12, 42, 52, 60, 62 -> 2회전 끝
		==  --  비교              ==  -- 비교               ==  --  비교

		12, 42, 52, 60, 62 -> 12, 42, 52, 60, 62 -> 3회전 끝
		==  --  비교              ==  --  비교

		12, 42, 52, 60, 62 -> 4회전 끝
		==  --  비교
		*/
	}
}