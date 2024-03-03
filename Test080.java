/*=================================
■■■ 배열 ■■■
- 배열의 기본적 활용
=================================*/

// 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
// 프로그램을 구현한다.

// 배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8
// 3의 배수 선택적 출력
// 9 3 6
// 계속하려면 아무 키나 누르세요...

public class Test080
{
	public static void main(String[] args)
	{
		/*
		int[] arr;

		arr = new int[9];

		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		/*
		int [] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		
		System.out.println("배열 요소 전체 출력");

		for (int a=0; a<9; a++)
		{
			System.out.printf("%d", arr[a]);
		}
		
		System.out.println("\n짝수 선택적 출력");
		for (int a=0; a<9; a++)
		{
			if (arr[a]%2==0)
			{
				System.out.printf("%d", arr[a]);
			}
		}

		System.out.println("\n3의 배수 선택적 출력");
		for (int a=0; a<9; a++)
		{
			if (arr[a]%3==0)
			{
				System.out.printf("%d", arr[a]);
			}
		}
		System.out.println();
		*/

//--------------------------------------------------------------------------

		//배열 선언 및 초기화
		//방법 1
		/*int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		//방법 2
		int[] arr ={4, 7, 9, 1, 3, 2, 5, 6, 8};

		//System.out.println(arr);
		//[I@15db9742

		// 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		// 배열에 담긴 데이터들을 출력할 수 없다.
		
		/*
		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<9; i++)                    //i<=8로 안하는 이유는 int[9]에 맞춰줌
		{
			System.out.print(arr[i] + " ");
			//배열 요소 전체 출력
			//4 7 9 1 3 2 5 6 8
		}
		System.out.println();
		*/
		
		/*
		int[] arr2 = {3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 3, 5, 1, 3, 7, 2, 5, 3, 2, 1, 4};
		System.out.println(arr2.length);
		//21                            -> 몇개인지 모를때 사용할 수 있음.
		*/

		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("짝수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{
			/*// 틀린 예
			if (i%2==0)                   // i가 짝수라면 짝수 번째에 해당하는 요소라면
			{
				//System.out.print(i + " ");                  // 해당 인덱스를 출력해~
				System.out.print(arr[i] + " ");             //인덱스에 해당하는 값을 출력해~
			}*/
			
			if (arr[i]%2==0)     //i번째 요소의 값이 짝수라면
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println("\n3의 배수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%3==0)     //i번째 요소의 값이 짝수라면
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}