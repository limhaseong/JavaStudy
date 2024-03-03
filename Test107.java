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

//선택 정렬(Selection Sort)
//실행 예)
//Source Data: 52 42 12 62 69
//Sorted Data: 12 42 52 60 62
//계속하려면 아무 키나 누르세요...

public class Test107
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};

		int i,j;

		System.out.print("Source Data: ");

		/*
		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/

		//향상된 for문(foreach 구문)
		for (int n : a)                  //for(자료형 변수명: 대상자료구조) -> for(int n:a)
		{
			System.out.print(n + " ");
		}
		System.out.println();

		//정렬
		//-> Selection Sort
		for (i=0; i<a.length-1; i++)           //웅~~    -> 비교기준데이터(  0     1    2   3)
		{
			for (j=i+1; j<a.length; j++)       //숑숑숑~ -> 비교대상데이터( 1234  234   34   4 )
			{
				//크기비교
				if (a[i]>a[j])                 // 오름차순 정렬         //if (a[i]<a[j]) -> 내림차순 정렬 
				{
					//자리바꾸기
					a[i]=a[i]^a[j];
					a[j]=a[j]^a[i];
					a[i]=a[i]^a[j];
				}
			}
		}


		//결과 출력
		System.out.print("Sorted Data: ");
		/*
		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();*/
		
		for (int n : a )
		{
			System.out.print(n + " ");
		}
		System.out.println();

//---------------------------------------------------------------------------------------------------------------
		
		/*
		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<5; j++)
			{
				if (a[i]>a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
		
		
		/* 선택 정렬
		52, 42, 12, 62, 60 -> 42, 52, 12, 62, 60 -> 12, 42, 52, 62, 60 -> 12, 42, 52, 62, 60 -> 이렇게 하면 1회전 끝(제일 작은 수가 왼쪽에 자리 잡음)
		==  --  비교          ==      --  비교      ==          --  비교  ==              -- 비교
		
		12, 42, 52, 62, 60 -> 12, 42, 52, 62, 60 -> 12, 42, 52, 62, 60 -> 2회전 끝
            ==  --  비교          ==      --  비교      ==          -- 비교
		
		12, 42, 52, 62, 60 -> 12, 42, 52, 62, 60 -> 3회전 끝
		        ==  --  비교          ==      -- 비교

		12, 42, 52, 62, 60 -> 12, 42, 52, 60, 62 -> 끝
		            ==  -- 비교
		*/
	}
}